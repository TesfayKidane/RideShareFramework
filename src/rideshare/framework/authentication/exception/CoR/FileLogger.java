package rideshare.framework.authentication.exception.CoR;

public class FileLogger extends AbstractExeption {
	
	public FileLogger(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		
		System.out.println("File::Logger: " + message);
	}

}