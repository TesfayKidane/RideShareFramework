package rideshare.framework.domain.common;

import java.util.HashSet;
import java.util.Set;

public class User extends AEntity {

	private Long id = null;


	private int version = 0;


	private String firstName;

	private String lastName;


	private String email;


	private int ranking = 0;
	

	private String phone;


	private boolean admin = false;

	
	private UserCredentials userCredentials;


	private Set<Address> addresses = new HashSet<>();


	private Set<Ride> createdRides = new HashSet<>();
	
	public Set<Ride> getCreatedRides() {
		return createdRides;
	}

	public void setCreatedRides(Set<Ride> createdRides) {
		this.createdRides = createdRides;
	}
	
	public void addCreatedRide(Ride ride) {
		createdRides.add(ride);
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}