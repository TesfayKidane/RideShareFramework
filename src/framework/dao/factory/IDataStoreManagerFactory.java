package framework.dao.factory;

import framework.dao.IDataStoreManager;

public interface IDataStoreManagerFactory<T> {
	
	public IDataStoreManager<T> createDataStoreManager(Object className);

}
