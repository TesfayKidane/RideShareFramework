package rideshare.framework.domain.common;

import java.util.*;

/**
 * 
 * @author Tesfay
 *
 */

public class Ride extends AEntity {

	private Long id = null;

	private int version = 0;

	private String rideOriginCity;

	private String rideDestinationCity;

	private User rideOwner;

	private int availableSeats;

	private String description;

	private String phone;

	private double maxLuggagePerUser;

	private double ridePrice;

	private Set<User> usersThatReservedRide = new HashSet<User>();

	private Set<String> rideUsersId = new HashSet<String>();

	private List<String> carImages = new ArrayList<String>();

	private Date created = new Date();

	private Date rideDate;

	private Date rideTime;
	
	private Date rideReturnDate;

	private Date rideReturnTime;

	private RideType rideType;
	// ********************** Accessor Methods ********************** //

	private String rideOwnerId;

	public Set<String> getRideUsersId() {
		return rideUsersId;
	}

	public void setRideUsersId(Set<String> rideUsersId) {
		this.rideUsersId = rideUsersId;
	}

	public void addRideUsersId(String userId) {
		rideUsersId.add(userId);
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public double getRidePrice() {
		return ridePrice;
	}

	public void setRidePrice(double ridePrice) {
		this.ridePrice = ridePrice;
	}

	public Date getRideDate() {
		return rideDate;
	}

	public void setRideDate(Date rideDate) {
		this.rideDate = rideDate;
	}

	public Date getRideTime() {
		return rideTime;
	}

	public void setRideTime(Date rideTime) {
		this.rideTime = rideTime;
	}

	public User getRideOwner() {
		return rideOwner;
	}

	public int getRemainingSeats() {
		return this.availableSeats - 1;
	}

	public Collection<String> getCarImages() {
		return carImages;
	}

	public String getRideOriginCity() {
		return rideOriginCity;
	}

	public void setRideOriginCity(String rideOriginCity) {
		this.rideOriginCity = rideOriginCity;
	}

	public String getRideDestinationCity() {
		return rideDestinationCity;
	}

	public void setRideDestinationCity(String rideDestinationCity) {
		this.rideDestinationCity = rideDestinationCity;
	}

	public String getRideOwnerId() {
		return rideOwnerId;
	}

	public void setRideOwnerId(String rideOwnerId) {
		this.rideOwnerId = rideOwnerId;
	}

	public Long getId() {
		return id;
	}

	public int getVersion() {
		return version;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getMaxLuggagePerUser() {
		return maxLuggagePerUser;
	}

	public void setMaxLuggagePerUser(double maxLuggagePerUser) {
		this.maxLuggagePerUser = maxLuggagePerUser;
	}

	public void setRideOwner(User rideOwner) {
		this.rideOwner = rideOwner;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}

	public void addCarImages(String image) {
		this.carImages.add(image);
	}

	public void setCarImages(List<String> carImages) {
		this.carImages = carImages;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsersThatReservedRide() {
		return usersThatReservedRide;
	}

	public void setUsersThatReservedRide(Set<User> usersThatReservedRide) {
		this.usersThatReservedRide = usersThatReservedRide;
	}

	public void addUsersThatReservedRide(User user) {
		usersThatReservedRide.add(user);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	// ********************** Common Methods ********************** //

	public Date getRideReturnDate() {
		return rideReturnDate;
	}

	public void setRideReturnDate(Date rideReturnDate) {
		this.rideReturnDate = rideReturnDate;
	}

	public Date getRideReturnTime() {
		return rideReturnTime;
	}

	public void setRideReturnTime(Date rideReturnTime) {
		this.rideReturnTime = rideReturnTime;
	}

	public RideType getRideType() {
		return rideType;
	}

	public void setRideType(RideType rideType) {
		this.rideType = rideType;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Ride))
			return false;

		final Ride item = (Ride) o;

		if (!(created.getTime() == item.created.getTime()))
			return false;
		if (rideOriginCity != null ? !rideOriginCity.equals(item.rideOriginCity) : item.rideOriginCity != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result;
		result = (rideOriginCity != null ? rideOriginCity.hashCode() : 0);
		result = 29 * result;
		return result;
	}

	public int compareTo(Object o) {
		if (o instanceof Ride) {
			// Don't compare Date objects! Use the time in milliseconds!
			return Long.valueOf(this.getCreated().getTime()).compareTo(Long.valueOf(((Ride) o).getCreated().getTime()));
		}
		return 0;
	}

	// ********************** Business Methods ********************** //

}
