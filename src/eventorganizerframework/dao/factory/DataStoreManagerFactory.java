package eventorganizerframework.dao.factory;

import java.util.HashMap;
import java.util.Map;

import eventorganizerframework.chat.midiator.User;
import eventorganizerframework.dao.IDataStoreManager;
import eventorganizerframework.dao.impl.AddressDaoImpl;
import eventorganizerframework.dao.impl.EventDaoImpl;
import eventorganizerframework.dao.impl.UserDaoImpl;
import eventorganizerframework.domain.Address;
import eventorganizerframework.domain.Event;

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
