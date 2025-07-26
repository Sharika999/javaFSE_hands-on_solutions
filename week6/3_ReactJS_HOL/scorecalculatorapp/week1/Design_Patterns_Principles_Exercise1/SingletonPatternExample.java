package Design_Patterns_Principles_Exercise1;
// Author: Sharika
public class SingletonPatternExample {

    static class Logger {
        private static Logger instance;

        private Logger() {
            System.out.println("Logger is ready");
        }

        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println("Log message: " + message);
        }

        public void clearLogs() {
            System.out.println("Logs cleared");
        }
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log");
        logger1.clearLogs();

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log");

        if (logger1 == logger2) {
            System.out.println("Same instance used");
        } else {
            System.out.println("Different instances");
        }
    }
}
