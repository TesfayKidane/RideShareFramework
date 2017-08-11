package framework.service.factory;

import framework.domain.User;

public interface IEventTypeDescriber {
	public boolean isPublic();
	public boolean isFree();
	public boolean isInvited(User user);	
}
