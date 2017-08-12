package rideshare.framework.services.impl.payment.strategy;

import rideshare.framework.services.impl.payment.factory.APaymentInfo;

public class PaymentMethod {

	private IPaymentStrategy paymentStrategy;

	public void setPaymentStragey(IPaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public boolean pay(APaymentInfo aPaymentInfo) {
		return paymentStrategy.makePayment(aPaymentInfo);
	}
}
