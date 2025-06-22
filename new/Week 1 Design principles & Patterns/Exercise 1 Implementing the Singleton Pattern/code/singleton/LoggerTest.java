package singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Executing operation...");

        if (logger1 == logger2) {
            System.out.println("Same logger instance is being used.");
        } else {
            System.out.println("Different instances detected.");
        }
        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
    }
}
