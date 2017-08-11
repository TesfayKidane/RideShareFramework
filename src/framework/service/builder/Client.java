package framework.service.builder;

import framework.domain.Event;

public class Client {
	public static void main(String[] args) {
		EventDirector ed = new EventDirector(new PublicFreeEventBuilder());
		ed.constructEvent();
		Event event = ed.getEvent();
		System.out.println(event);
	}
}
