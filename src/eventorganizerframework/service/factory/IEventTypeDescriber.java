package eventorganizerframework.service.factory;

import eventorganizerframework.domain.User;

public interface IEventTypeDescriber {
	public boolean isPublic();
	public boolean isFree();
	public boolean isInvited(User user);	
}
