package rideshare.framework.dao.payment.factory;

import java.util.HashMap;
import java.util.Map;

import rideshare.framework.dao.AccountManager;
import rideshare.framework.dao.BalanceManager;
import rideshare.framework.dao.IDataManager;
import rideshare.framework.dao.RideManager;
import rideshare.framework.dao.TransactionManager;
import rideshare.framework.dao.UserManager;
import rideshare.framework.domain.common.Ride;
import rideshare.framework.domain.payment.Account;
import rideshare.framework.domain.payment.Balance;
import rideshare.framework.domain.payment.Transaction;

public class DataStoreFactory implements IDataStoreFactory {
    private static IDataStoreFactory instance = new DataStoreFactory();
    private static Map<Object, IDataManager> stores = new HashMap<>();

    static {
        stores.put(Account.class, new AccountManager());
        stores.put(Balance.class, new BalanceManager());
        stores.put(Transaction.class, new TransactionManager());
        stores.put(rideshare.framework.domain.common.User.class, new UserManager());
        stores.put(Ride.class, new RideManager());
    }

    private DataStoreFactory(){}

    public static IDataStoreFactory getInstance(){
        return instance;
    }

    @Override
    public IDataManager<Object> getDataStoreManager(Object object) {
        if(stores.containsKey(object))
            return stores.get(object);

        return null;
    }
}
