package rideshare.framework.domain.common.builder;

import rideshare.framework.domain.common.Ride;

public class RideDirector {
	private IRideBuilder rideBuilder;
	public RideDirector(IRideBuilder rideBuilder){
		this.rideBuilder = rideBuilder;
	}
	
	public void constructRide(){
		rideBuilder.setRideType();
		rideBuilder.calculatePrice();
	}
	
	public Ride getSampleRide(){
		return rideBuilder.getSampleRide();
	}
}
