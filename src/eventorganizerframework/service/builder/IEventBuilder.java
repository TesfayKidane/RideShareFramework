package eventorganizerframework.service.builder;

import eventorganizerframework.domain.Event;

public interface IEventBuilder {
	public void buildEventCreator();
	public void buildEventParticipants();
	public void buildStartLocation();
	public void buildEndLocation();
	public void buildEventLocationMap();
	public void buildEventLogo();
	public void buildEventBanner();	
	
	public Event getEvent();
}
