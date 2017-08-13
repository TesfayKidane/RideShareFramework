package rideshare.framework.authentication.exception.CoR;

public class ChainBuilder {
	private AbstractLogger logHandler;
	private static ChainBuilder chainBuilder = new ChainBuilder();

	private ChainBuilder() {
		buildChain();
	}

	public static ChainBuilder getChainBuilder() {
		return chainBuilder;
	}

	public AbstractLogger getLogHandler() {
		return logHandler;
	}

	private AbstractLogger buildChain() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}
}
