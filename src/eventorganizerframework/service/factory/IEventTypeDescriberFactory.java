package eventorganizerframework.service.factory;

import eventorganizerframework.domain.EventType;
import eventorganizerframework.service.builder.IEventBuilder;

public interface IEventTypeDescriberFactory {
	public IEventTypeDescriber getEventTypeDescriber(EventType eventType);
	public IEventBuilder getEventBuilder(EventType eventType);
}
