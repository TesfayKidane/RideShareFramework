package rideshare.framework.services.impl.payment.factory;

public class PaypalPaymentInfo extends APaymentInfo{
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return " PaypalPaymentInfo [email=" + email + "]  " + super.toString() ;
	}	
}
