package behavioral.chainOfResponsibility;

public class LoggerDemo {

    public static void main(String[] args) throws InterruptedException {


        DebugLogger debugLogger = new DebugLogger(null);
        InfoLogger infoLogger = new InfoLogger(debugLogger);
        WarningLogger warningLogger = new WarningLogger(infoLogger);
        Logger logger = new ErrorLogger(warningLogger);

        warningLogger.setNextLogger(null); // ucinam łańcuch od razu po warningu


        logger.log("Ilość czujników dymu: 5", LogLvl.DEBUG);
        logger.log("System antypożarowy uruchomiony", LogLvl.INFO);
        logger.log("Chyba ktoś podłożył ogień...", LogLvl.WARNING);
        logger.log("Wszystko wybuchło!", LogLvl.ERROR);
    }



}
