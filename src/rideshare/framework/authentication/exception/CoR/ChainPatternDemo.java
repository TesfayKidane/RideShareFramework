package rideshare.framework.authentication.exception.CoR;

public class ChainPatternDemo {
	
	private static AbstractExeption getChainOfLoggers(){

		AbstractExeption errorLogger = new ErrorLogger(AbstractExeption.ERROR);		 
		AbstractExeption fileLogger = new FileLogger(AbstractExeption.DEBUG);
		AbstractExeption consoleLogger = new ConsoleLogger(AbstractExeption.INFO);
	      

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }

	public static void main(String[] args) {
		AbstractExeption loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractExeption.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractExeption.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractExeption.ERROR, 
	         "This is an error information.");

	}

}
