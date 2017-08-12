package rideshare.framework.template;

import rideshare.framework.dao.IDataManager;
import rideshare.framework.dao.payment.factory.DataStoreFactory;
import rideshare.framework.domain.common.AEntity;
import rideshare.framework.domain.common.Ride;
import rideshare.framework.domain.common.User;

public class RideEntityAdding extends AEntityAddingTemplate{

	@Override
	public void addAEntity(AEntity aEntity, User user, IDataManager<Object> dataManager) {
		// TODO Auto-generated method stub
		user.addCreatedRide((Ride)aEntity);
		dataManager.add(aEntity);
	}

	@Override
	public User getCurrentUser(int userId) {
		return (User) DataStoreFactory.getInstance().getDataStoreManager(User.class).getElement(userId);
	}

	@Override
	public IDataManager<Object> getDataManager() {
		return DataStoreFactory.getInstance().getDataStoreManager(Ride.class);
	}

}
