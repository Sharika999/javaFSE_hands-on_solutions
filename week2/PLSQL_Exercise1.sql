-- Author: Sharika
-- Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.

BEGIN
    FOR cust IN (SELECT CustomerID, InterestRate FROM Customers WHERE Age > 60) LOOP
        UPDATE Customers
        SET InterestRate = InterestRate - (InterestRate * 0.01)
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 2: A customer can be promoted to VIP status based on their balance.

BEGIN
    FOR cust IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.

DECLARE
    CURSOR loan_cursor IS
        SELECT CustomerID, LoanDueDate
        FROM Loans
        WHERE LoanDueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR loan IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan due for customer ' || loan.CustomerID || ' on ' || TO_CHAR(loan.LoanDueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
