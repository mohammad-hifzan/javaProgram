public class LogLine {
    private String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logType = extractLogType(logLine);
        return getLogType(logType);
        // throw new UnsupportedOperationException("Please implement the getLogLevel() method");
    }

    public String getOutputForShortLog() {
        // throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
        String logMessage = logLine.split(": ")[1];
        String logType = extractLogType(logLine);
        LogLevel log = getLogType(logType);
        return log.getLogNumber() + ":" + logMessage;
    }

    public String extractLogType(String logLine) {
        String type = logLine.split(":")[0];
        return type.replace("[", "").replace("]", "");
    }

    private LogLevel getLogType(String type) {
        switch (type) {
            case "INF":
                return LogLevel.INFO;
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }
}
