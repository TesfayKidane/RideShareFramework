package rideshare.framework.domain.common.builder;

import java.sql.Date;

import rideshare.framework.domain.common.Ride;

public interface IRideBuilder {
	public final Ride ride = null;
	public abstract void setRideType();
	public abstract void calculatePrice();
	public default Ride getSampleRide(){
		Ride ride = new Ride();
		ride = new Ride();
		ride.setId(0l);
		ride.setAvailableSeats(5);
		ride.setCreated(Date.valueOf("2017-10-12"));
		ride.setDescription("Enjoy the ride");
		ride.setMaxLuggagePerUser(1);
		ride.setPhone("23498492");
		ride.setRideDate(Date.valueOf("2017-10-15"));
		ride.setRideOriginCity("Denver");
		ride.setRideDestinationCity("Seattle");
		ride.setRideOwnerId("1");
		ride.setRidePrice(25.00);
		return ride;
	}
}
