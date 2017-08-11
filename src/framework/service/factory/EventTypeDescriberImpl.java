package framework.service.factory;

import framework.domain.EventType;
import framework.service.builder.IEventBuilder;
import framework.service.builder.PrivateBusinessEventBuilder;
import framework.service.builder.PrivateFreeEventBuilder;
import framework.service.builder.PublicBusinessEventBuilder;
import framework.service.builder.PublicFreeEventBuilder;

public class EventTypeDescriberImpl implements IEventTypeDescriberFactory {

	public static EventTypeDescriberImpl setf = new EventTypeDescriberImpl();

	private EventTypeDescriberImpl() {
		// TODO Auto-generated constructor stub
	}

	public static IEventTypeDescriberFactory getEventTypeFactory() {
		return setf;
	}

	@Override
	public IEventTypeDescriber getEventTypeDescriber(EventType eventType) {
		if (eventType.equals(EventType.PRIVATEFREE))
			return new PrivateFreeEventType();
		else if (eventType.equals(EventType.PRIVATEBUSINESS))
			return new PrivateBusinessEventType();
		else if (eventType.equals(EventType.PUBLICFREE))
			return new PublicFreeEventType();
		else if (eventType.equals(EventType.PUBLICBUSINESS))
			return new PublicBusinessEventType();
		else
			return null;
	}

	@Override
	public IEventBuilder getEventBuilder(EventType eventType) {
		if (eventType.equals(EventType.PRIVATEFREE))
			return new PrivateFreeEventBuilder();
		else if (eventType.equals(EventType.PRIVATEBUSINESS))
			return new PrivateBusinessEventBuilder();
		else if (eventType.equals(EventType.PUBLICFREE))
			return new PublicFreeEventBuilder();
		else if (eventType.equals(EventType.PUBLICBUSINESS))
			return new PublicBusinessEventBuilder();
		else
			return null;
	}

}
