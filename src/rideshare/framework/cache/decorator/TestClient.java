package rideshare.framework.cache.decorator;

import java.util.Arrays;
import java.util.List;

import rideshare.framework.domain.common.Ride;
import rideshare.framework.domain.common.builder.RideDirector;
import rideshare.framework.domain.common.builder.RoundTripRideBuilder;

public class TestClient {
	public static void main(String[] args) {

		ACache<String, Ride> cacheOEC = new OldestEntryBasedCache<>();
		RideDirector rd = new RideDirector(new RoundTripRideBuilder());
		long cacheCapacity = 5;
		cacheOEC.setCacheCapacity(cacheCapacity);
		for (Long i = 1l; i <= cacheCapacity+1; i++) {
			String key = "Key" + i;
			rd.constructRide();
			Ride ride = rd.getSampleRide();
			ride.setId(i);
			cacheOEC.set(key, Arrays.asList(ride));
		}

		for (Long i = 1l; i <= cacheCapacity+1; i++) {
			String key = "Key" + i;
			List<Ride> r = cacheOEC.get(key);
			if (r != null)
				System.out.println(r.get(0).getId());
			else
				System.out.println(key + " not found in cache.");
		}
		// Now add one more which is over the capacity
		String key = "Key" + cacheCapacity+2;
		rd.constructRide();
		Ride ride = rd.getSampleRide();
		ride.setId(cacheCapacity+1);
		cacheOEC.set(key, Arrays.asList(ride));
		
		// If the we try to get the first entry it should not be found in the cache
		key = "Key" + 1l;
		List<Ride> r = cacheOEC.get(key);
		if (r != null)
			System.out.println(r.get(0).getId());
		else
			System.out.println(key + " not found in cache.");
	}
}
