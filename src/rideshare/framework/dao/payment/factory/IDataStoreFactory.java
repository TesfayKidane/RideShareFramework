package rideshare.framework.dao.payment.factory;

import rideshare.framework.dao.IDataManager;

public interface IDataStoreFactory {
    IDataManager<Object> getDataStoreManager(Object object);
}
