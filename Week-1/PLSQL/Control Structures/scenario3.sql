BEGIN
    FOR rec IN (
        SELECT l.loan_id,
               c.name,
               l.due_date
        FROM loans l
        JOIN customers c ON c.customer_id = l.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: ' || rec.name ||
            ' - Loan ID ' || rec.loan_id ||
            ' due on ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/