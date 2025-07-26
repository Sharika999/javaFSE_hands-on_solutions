-- Author: Sharika
-- Scenario 1: The bank needs to process monthly interest for all savings accounts.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END;
/

-- Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_id IN NUMBER,
    bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE DepartmentID = dept_id;
END;
/

-- Scenario 3: Customers should be able to transfer funds between their accounts.

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) AS
    insufficient_balance EXCEPTION;
    current_balance NUMBER;
BEGIN
    SELECT Balance INTO current_balance FROM Accounts WHERE AccountID = from_account FOR UPDATE;

    IF current_balance < amount THEN
        RAISE insufficient_balance;
    END IF;

    UPDATE Accounts
    SET Balance = Balance - amount
    WHERE AccountID = from_account;

    UPDATE Accounts
    SET Balance = Balance + amount
    WHERE AccountID = to_account;

    COMMIT;
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance in source account.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
        ROLLBACK;
END;
/
