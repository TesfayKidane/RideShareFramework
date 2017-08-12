package rideshare.framework.command;

public class DataOperationsInvoker {

	ICommand insertCommand;
	ICommand deleteCommand;
	ICommand updateCommand;
	
	public DataOperationsInvoker(ICommand insertCommand, ICommand deleteCommand, ICommand updateCommand) {
		this.insertCommand = insertCommand;
		this.deleteCommand = deleteCommand;
		this.updateCommand = updateCommand;
	}
	
	public boolean insert(){
		return insertCommand.execute();
	}
	
	public boolean update(){
		return updateCommand.execute();
	}
	
	public boolean delete(){
		return deleteCommand.execute();
	}
	
}
