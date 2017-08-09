package eventorganizerframework.service.factory;

import eventorganizerframework.domain.User;

public class PrivateBusinessEventType implements IEventTypeDescriber{

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
		// check if user is in the list of invited guests.
		return false;
	}

}
