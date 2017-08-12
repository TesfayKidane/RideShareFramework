package rideshare.framework.command;

import rideshare.framework.dao.IDataManager;

public class InsertCommand implements ICommand{

	private IDataManager dataManager;
	private Object element;
	@Override
	public boolean execute() {
		return dataManager.add(element);
	}

	@Override
	public void setElement(Object object) {
		this.element = object;
		
	}

	@Override
	public void setDataManager(IDataManager dataManager) {
		this.dataManager = dataManager;
		
	}

}
