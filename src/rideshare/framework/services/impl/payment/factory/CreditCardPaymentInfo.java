package rideshare.framework.services.impl.payment.factory;

import java.util.Date;

public class CreditCardPaymentInfo extends APaymentInfo{	
	private String cardNumber;
	private Date expirationDate;
	private String securityNumber;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getSecurityNumber() {
		return securityNumber;
	}
	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}
	@Override
	public String toString() {
		super.toString();
		return "CreditCardPaymentInfo [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate
				+ ", securityNumber=" + securityNumber + "]";
	}
}
