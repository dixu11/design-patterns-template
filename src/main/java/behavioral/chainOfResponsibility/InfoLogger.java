package behavioral.chainOfResponsibility;

public class InfoLogger extends Logger {
    InfoLogger(Logger nextLogger) {
        super(nextLogger, LogLvl.INFO);
    }

    @Override
    public void showLog(String message) {
        System.out.println("INFO: " + message);
    }
}
