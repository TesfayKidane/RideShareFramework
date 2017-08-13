package rideshare.framework.authentication.exception.CoR;

public class TestClient {

	public static void main(String[] args) {
		AbstractLogger loggerChain = ChainBuilder.getChainBuilder().getLogHandler();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

	}

}
