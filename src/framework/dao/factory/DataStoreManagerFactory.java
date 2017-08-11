package framework.dao.factory;

import java.util.HashMap;
import java.util.Map;

import framework.chat.midiator.User;
import framework.dao.IDataStoreManager;
import framework.dao.impl.AddressDaoImpl;
import framework.dao.impl.EventDaoImpl;
import framework.dao.impl.UserDaoImpl;
import framework.domain.Address;
import framework.domain.Event;

public class DataStoreManagerFactory implements IDataStoreManagerFactory{
	public static DataStoreManagerFactory dataStoreManagerFactory = new DataStoreManagerFactory();
	public static Map<Object, IDataStoreManager> dataStoreManagers = new HashMap<>();
	
	static{
		dataStoreManagers.put(Address.class, new AddressDaoImpl());
		dataStoreManagers.put(User.class, new UserDaoImpl());
		dataStoreManagers.put(Event.class, new EventDaoImpl());
	}
	
	public IDataStoreManagerFactory getDataStoreManagerFactory(){
		return dataStoreManagerFactory;
		
	}
	
	private DataStoreManagerFactory() {
	}

	@Override
	public IDataStoreManager createDataStoreManager(Object className) {
		if(dataStoreManagers.containsKey(className))
			return dataStoreManagers.get(className);
		return null;
	}

}
