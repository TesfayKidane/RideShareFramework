package rideshare.framework.authentication.exception.CoR;

public class ChainBuilder {
	private static ChainBuilder chainBuilder = new ChainBuilder();
	
	public static ChainBuilder getChainBuilder(){
		return chainBuilder;
	}
}
