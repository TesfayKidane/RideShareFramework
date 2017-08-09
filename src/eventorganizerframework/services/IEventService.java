package eventorganizerframework.services;

import java.util.List;

import eventorganizerframework.domain.Event;

public interface IEventService {
	public void save(Event event);
	public void update(Event event);
	public List<Event> findAll();
	public Event findOne(Long id);
}
