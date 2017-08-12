package rideshare.framework.services.impl.payment.factory;

public class OnlinePaymentInfo extends APaymentInfo{	
	private String firstName;
	private String lastName;
	private String iBAN;
	private String bIC;
	private String billingAddress;
	private String city;
	private String zipCode;
	private String country;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getiBAN() {
		return iBAN;
	}
	public void setiBAN(String iBAN) {
		this.iBAN = iBAN;
	}
	public String getbIC() {
		return bIC;
	}
	public void setbIC(String bIC) {
		this.bIC = bIC;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		super.toString();
		return "OnlinePaymentInfo [firstName=" + firstName + ", lastName=" + lastName + ", iBAN=" + iBAN + ", bIC="
				+ bIC + ", billingAddress=" + billingAddress + ", city=" + city + ", zipCode=" + zipCode + ", country="
				+ country + "]";
	}
}
