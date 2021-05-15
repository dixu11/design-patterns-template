package behavioral.chainOfResponsibility;

public class ErrorLogger extends Logger {


    public ErrorLogger(Logger nextLogger){
        super(nextLogger, LogLvl.ERROR);
    }

    @Override
    public void showLog(String message) {
        System.err.println("ERROR: " + message.toUpperCase());
    }
}
