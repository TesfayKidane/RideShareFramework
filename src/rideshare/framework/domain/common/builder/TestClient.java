package rideshare.framework.domain.common.builder;

public class TestClient {
	public static void main(String[] args){
		RideDirector rd = new RideDirector(new RoundTripRideBuilder());
		rd.constructRide();
		System.out.println(rd.getSampleRide());
	}
}
