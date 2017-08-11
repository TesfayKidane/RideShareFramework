package framework.service.builder;

import framework.domain.Event;
import framework.service.factory.IEventTypeDescriber;

public class EventDirector {

	private IEventBuilder eventBuilder = null;
	private IEventTypeDescriber eventTypeDescriber = null;

	public EventDirector(IEventBuilder eventBuilder) {
		this.eventBuilder = eventBuilder;
	}
	public EventDirector(IEventTypeDescriber eventType, IEventBuilder eventBuilder) {
		this.eventTypeDescriber = eventType;
		this.eventBuilder = eventBuilder;
	}
	public void constructEvent(){
		eventBuilder.buildEventCreator();
		eventBuilder.buildEventParticipants();
		eventBuilder.buildStartLocation();
		eventBuilder.buildEndLocation();
		eventBuilder.buildEventLocationMap();
		eventBuilder.buildEventLogo();
		eventBuilder.buildEventBanner();	
	}
	
	public Event getEvent(){
		return eventBuilder.getEvent();
	}
}
