package rideshare.framework.authentication.exception.CoR;

public class ConsoleLogger extends AbstractExeption {

	   public ConsoleLogger(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Standard Console::Logger: " + message);
	   }
	}
