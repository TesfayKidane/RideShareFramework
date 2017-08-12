package rideshare.framework.command;

import java.time.LocalDate;
import java.time.Month;

import rideshare.framework.dao.IDataManager;
import rideshare.framework.dao.payment.factory.DataStoreFactory;
import rideshare.framework.domain.payment.Account;

public class TestClient {
	public static void main(String[] args){
		IDataManager<Object> accountManager =  DataStoreFactory.getInstance().getDataStoreManager(Account.class);
		ICommand insertCommand = new InsertCommand();
		insertCommand.setDataManager(accountManager);
		Account account = new Account(344,212412341, "FHHH", LocalDate.of(2014, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 1), 1.99f,"Cash");
		insertCommand.setElement(account);
		
		ICommand updateCommand = new UpdateCommand();
		account.setAccountNumber(111111);
		account.setInterestRate(2.0f);
		updateCommand.setDataManager(accountManager);
		updateCommand.setElement(account);	
		
		ICommand deleteCommand = new DeleteCommand();
		deleteCommand.setDataManager(accountManager);
		deleteCommand.setElement(account);
		
		DataOperationsInvoker doInvoker = new DataOperationsInvoker(insertCommand, deleteCommand, updateCommand);
		doInvoker.insert();
		doInvoker.update();
		doInvoker.delete();
	}
}
