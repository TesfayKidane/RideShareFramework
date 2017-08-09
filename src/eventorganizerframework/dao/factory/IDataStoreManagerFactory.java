package eventorganizerframework.dao.factory;

import eventorganizerframework.dao.IDataStoreManager;

public interface IDataStoreManagerFactory<T> {
	
	public IDataStoreManager<T> createDataStoreManager(Object className);

}
