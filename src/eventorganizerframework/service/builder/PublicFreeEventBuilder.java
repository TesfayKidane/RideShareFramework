package eventorganizerframework.service.builder;

import eventorganizerframework.domain.Event;
import eventorganizerframework.domain.User;

public class PublicFreeEventBuilder implements IEventBuilder {

	private Event event;
	public PublicFreeEventBuilder() {
		this.event = new Event();
	}
	
	@Override
	public void buildEventCreator() {
	    //User eventCreator = UserDataManager.getCurrentUser();
		//event.setEventCreator(eventCreator);
		
	}

	@Override
	public void buildEventParticipants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildStartLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildEndLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildEventLocationMap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildEventLogo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildEventBanner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event getEvent() {
		// TODO Auto-generated method stub
		return null;
	}

}
