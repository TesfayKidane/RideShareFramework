package eventorganizerframework.service.factory;

import eventorganizerframework.domain.User;

public class PublicBusinessEventType implements IEventTypeDescriber {

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
