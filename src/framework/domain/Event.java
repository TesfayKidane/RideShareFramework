/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.domain;

import java.awt.Image;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Tesfay
 */
public class Event {
    private Long eventId;
    private String eventName;
    private String eventDescription;
    private User eventCreator;
    private List<User> eventParticipants;
    private Address eventStartLocation;
    private Address eventEndLocation;
    private Date eventStartDate;
    private Date eventEndDate;   
    private LocationMap eventLocationMap;
    private java.awt.Image eventBanner;
    private java.awt.Image eventLogo;
    private EventStatus eventStatus;

    public EventStatus getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}

	public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public User getEventCreator() {
        return eventCreator;
    }

    public void setEventCreator(User eventCreator) {
        this.eventCreator = eventCreator;
    }

    public List<User> getEventParticipants() {
        return eventParticipants;
    }

    public void setEventParticipants(List<User> eventParticipants) {
        this.eventParticipants = eventParticipants;
    }

    public Address getEventStartLocation() {
        return eventStartLocation;
    }

    public void setEventStartLocation(Address eventStartLocation) {
        this.eventStartLocation = eventStartLocation;
    }

    public Address getEventEndLocation() {
        return eventEndLocation;
    }

    public void setEventEndLocation(Address eventEndLocation) {
        this.eventEndLocation = eventEndLocation;
    }

    public Date getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public Date getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(Date eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public LocationMap getEventLocationMap() {
        return eventLocationMap;
    }

    public void setEventLocationMap(LocationMap eventLocationMap) {
        this.eventLocationMap = eventLocationMap;
    }

    public Image getEventBanner() {
        return eventBanner;
    }

    public void setEventBanner(Image eventBanner) {
        this.eventBanner = eventBanner;
    }

    public Image getEventLogo() {
        return eventLogo;
    }

    public void setEventLogo(Image eventLogo) {
        this.eventLogo = eventLogo;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.eventName);
        hash = 59 * hash + Objects.hashCode(this.eventDescription);
        hash = 59 * hash + Objects.hashCode(this.eventStartDate);
        hash = 59 * hash + Objects.hashCode(this.eventEndDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Event other = (Event) obj;
        if (this.eventId != other.eventId) {
            return false;
        }
        if (!Objects.equals(this.eventName, other.eventName)) {
            return false;
        }
        if (!Objects.equals(this.eventDescription, other.eventDescription)) {
            return false;
        }
        if (!Objects.equals(this.eventStartDate, other.eventStartDate)) {
            return false;
        }
        if (!Objects.equals(this.eventEndDate, other.eventEndDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Event{" + "eventId=" + eventId + ", eventName=" + eventName + ", eventDescription=" + eventDescription + ", eventCreator=" + eventCreator + ", eventParticipants=" + eventParticipants + ", eventStartLocation=" + eventStartLocation + ", eventEndLocation=" + eventEndLocation + ", eventStartDate=" + eventStartDate + ", eventEndDate=" + eventEndDate + ", eventLocationMap=" + eventLocationMap + '}';
    }
}
