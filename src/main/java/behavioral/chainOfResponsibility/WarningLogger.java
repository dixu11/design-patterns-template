package behavioral.chainOfResponsibility;

public class WarningLogger extends Logger {
    WarningLogger(Logger nextLogger) {
        super(nextLogger, LogLvl.WARNING);
    }

    @Override
    public void showLog(String message) {
        System.err.println("WARNING: " + message);
    }
}
