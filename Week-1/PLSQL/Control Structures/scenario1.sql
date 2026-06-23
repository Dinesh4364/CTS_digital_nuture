BEGIN
    FOR rec IN (
        SELECT customer_id
        FROM customers
        WHERE age > 60
    ) LOOP
        UPDATE loans
        SET interest_rate = interest_rate * 0.99
        WHERE customer_id = rec.customer_id;
    END LOOP;

    COMMIT;
END;
/