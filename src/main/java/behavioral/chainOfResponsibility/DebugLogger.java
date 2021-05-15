package behavioral.chainOfResponsibility;

public class DebugLogger extends Logger {
    DebugLogger(Logger nextLogger) {
        super(nextLogger, LogLvl.DEBUG);
    }

    @Override
    public void showLog(String message) {
        System.out.println("(DEBUG: " + message + ")");
    }
}
