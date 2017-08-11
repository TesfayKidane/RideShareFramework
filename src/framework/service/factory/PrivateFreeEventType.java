package framework.service.factory;

import framework.domain.User;

public class PrivateFreeEventType implements IEventTypeDescriber{

	@Override
	public boolean isPublic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFree() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInvited(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
