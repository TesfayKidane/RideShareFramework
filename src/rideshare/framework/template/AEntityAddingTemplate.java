package rideshare.framework.template;

import rideshare.framework.dao.IDataManager;
import rideshare.framework.domain.common.AEntity;
import rideshare.framework.domain.common.User;


public abstract class AEntityAddingTemplate {

	public final void processEntityAdding(AEntity aEntity, int userId){
		IDataManager<Object> dataManager = getDataManager();
		User user = getCurrentUser(userId);
		addAEntity(aEntity, user, dataManager);
	}

	public abstract void addAEntity(AEntity aEntity, User user, IDataManager<Object> dataManager);
	
	public abstract User getCurrentUser(int userId);

	public abstract IDataManager<Object> getDataManager();
}
