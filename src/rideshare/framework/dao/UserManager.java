package rideshare.framework.dao;

import java.util.List;

import rideshare.framework.domain.common.User;

public class UserManager implements IDataManager<User>{

	@Override
	public User getElement(int id) {
		// TODO Auto-generated method stub
		return new User();
	}

	@Override
	public List<User> getElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getElements(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User element) {
		// TODO Auto-generated method stub
		return false;
	}

}
