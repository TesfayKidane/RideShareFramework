package rideshare.framework.domain.common.builder;

import rideshare.framework.domain.common.Ride;
import rideshare.framework.domain.common.RideType;

public class OneWayRideBuilder implements IRideBuilder{
	private Ride ride;
	public OneWayRideBuilder() {
		ride = getSampleRide();		
	}
	@Override
	public void setRideType() {
		ride.setRideType(RideType.ONEWAY);		
	}

	@Override
	public void calculatePrice() {
		ride.setRidePrice(2*ride.getRidePrice());		
	}
}
