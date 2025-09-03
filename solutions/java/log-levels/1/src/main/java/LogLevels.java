public class LogLevels {
    
    public static String message(String logLine) {
        String s = logLine.split(":")[1];
        return s.trim();
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(":")[0];
        if (level.equals("[ERROR]")) {
            return "error";
        } else if (level.equals("[WARNING]")) {
            return "warning";
        } else if (level.equals("[INFO]")) {
            return "info";
        } else {
            return "";
        }
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
