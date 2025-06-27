-- Author: Sharika

-- Scenario 1: Apply 1% discount to interest rates for customers over 60
BEGIN
    FOR cust IN (SELECT CustomerID, InterestRate FROM Customers WHERE Age > 60) LOOP
        UPDATE Customers
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 2: Promote customers to VIP if balance > 10000
BEGIN
    FOR cust IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 3: Print reminders for loans due in next 30 days
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
