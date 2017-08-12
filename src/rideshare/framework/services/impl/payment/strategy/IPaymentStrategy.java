package rideshare.framework.services.impl.payment.strategy;

import rideshare.framework.services.impl.payment.factory.APaymentInfo;

public interface IPaymentStrategy {
	
	public boolean makePayment(APaymentInfo paymentInfo);

}
