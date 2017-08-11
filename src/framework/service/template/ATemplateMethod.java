package framework.service.template;

import framework.domain.EventType;
import framework.service.builder.EventDirector;
import framework.service.builder.PublicFreeEventBuilder;
import framework.service.factory.EventTypeDescriberImpl;
import framework.service.factory.IEventTypeDescriberFactory;

public class ATemplateMethod {
	
	public final void createEvent(){
		//User user = getCurrentUser();
		boolean authenticated = true; // authenticate(user);
		if(authenticated==true){
			// call the event builder here
			// get eventType here
			EventType eventType = EventType.PUBLICFREE; // default
			
			// Use factory design pattern to get EventTypeDiscriber and EventBuilder based on the event type
			IEventTypeDescriberFactory setf = EventTypeDescriberImpl.getEventTypeFactory();
			
			EventDirector ed = new EventDirector(setf.getEventTypeDescriber(eventType), setf.getEventBuilder(eventType));
			ed.constructEvent();
		}
			
	}
}
