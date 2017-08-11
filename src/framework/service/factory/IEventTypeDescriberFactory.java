package framework.service.factory;

import framework.domain.EventType;
import framework.service.builder.IEventBuilder;

public interface IEventTypeDescriberFactory {
	public IEventTypeDescriber getEventTypeDescriber(EventType eventType);
	public IEventBuilder getEventBuilder(EventType eventType);
}
