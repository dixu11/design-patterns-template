package behavioral.chainOfResponsibility;

public abstract class Logger {

    private Logger nextLogger;
    private LogLvl loggerLevel;

    Logger(Logger nextLogger, LogLvl loggerLevel) {
        this.nextLogger = nextLogger;
        this.loggerLevel = loggerLevel;
    }

    public void log(String message, LogLvl lvl){
        if (lvl == loggerLevel) {
            showLog(message);
        } else if(nextLogger != null){ // tylko jeśli jest ktoś po mnie to przekazuje
            nextLogger.log(message, lvl);
        }
    }

   protected   abstract void showLog(String message);

    void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
