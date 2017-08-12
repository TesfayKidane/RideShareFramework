package rideshare.framework.command;

import rideshare.framework.dao.IDataManager;

public interface ICommand {
    boolean execute();
    void setElement(Object object);
    void setDataManager(IDataManager dataManager);
}
