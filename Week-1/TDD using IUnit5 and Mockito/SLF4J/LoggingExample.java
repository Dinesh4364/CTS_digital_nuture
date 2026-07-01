import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        System.out.println("Application Started...\n");

        logger.warn("This is a warning message.");

        logger.error("This is an error message.");

        System.out.println("\nApplication Finished.");
    }
}