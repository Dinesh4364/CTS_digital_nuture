import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAAPatternTest {

    private int number;

    @Before
    public void setUp() {
        System.out.println("========== BEFORE TEST ==========");
        System.out.println("Initializing test data...");
        number = 5;
        System.out.println("number = " + number);
        System.out.println();
    }

    @Test
    public void testSquare() {

        System.out.println("----- ARRANGE -----");
        int value = number;
        System.out.println("Value assigned = " + value);

        System.out.println("\n----- ACT -----");
        int result = value * value;
        System.out.println("Square of " + value + " = " + result);

        System.out.println("\n----- ASSERT -----");
        System.out.println("Expected = 25");
        System.out.println("Actual   = " + result);

        assertEquals(25, result);

        System.out.println("Test Passed Successfully!");
        System.out.println();
    }

    @Test
    public void testDouble() {

        System.out.println("----- ARRANGE -----");
        int value = number;
        System.out.println("Value assigned = " + value);

        System.out.println("\n----- ACT -----");
        int result = value * 2;
        System.out.println("Double of " + value + " = " + result);

        System.out.println("\n----- ASSERT -----");
        System.out.println("Expected = 10");
        System.out.println("Actual   = " + result);

        assertEquals(10, result);

        System.out.println("Test Passed Successfully!");
        System.out.println();
    }

    @After
    public void tearDown() {
        System.out.println("========== AFTER TEST ==========");
        System.out.println("Cleaning up test data...");
        number = 0;
        System.out.println("number reset to " + number);
        System.out.println("================================");
    }
}