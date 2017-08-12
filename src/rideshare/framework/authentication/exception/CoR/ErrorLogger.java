package rideshare.framework.authentication.exception.CoR;

public class ErrorLogger extends AbstractExeption {
	public ErrorLogger(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println("Username or password does not correct.");
		
	}

}
