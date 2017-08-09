package eventorganizerframework.service.template;

import eventorganizerframework.domain.EventType;
import eventorganizerframework.service.builder.EventDirector;
import eventorganizerframework.service.builder.PublicFreeEventBuilder;
import eventorganizerframework.service.factory.EventTypeDescriberImpl;
import eventorganizerframework.service.factory.IEventTypeDescriberFactory;

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
