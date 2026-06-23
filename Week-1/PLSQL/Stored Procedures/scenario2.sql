CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_pct  IN NUMBER
) AS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus_pct / 100)
    WHERE department = p_department;

    COMMIT;
END;
/

--To execute

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/