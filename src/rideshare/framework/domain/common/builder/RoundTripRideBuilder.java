package rideshare.framework.domain.common.builder;

import rideshare.framework.domain.common.Ride;
import rideshare.framework.domain.common.RideType;

public class RoundTripRideBuilder implements IRideBuilder {
	private Ride ride;
	public RoundTripRideBuilder() {
		ride = getSampleRide();		
	}
	@Override
	public void setRideType() {
		ride.setRideType(RideType.ROUNDTRIP);		
	}

	@Override
	public void calculatePrice() {
		ride.setRidePrice(2*ride.getRidePrice());		
	}
}
