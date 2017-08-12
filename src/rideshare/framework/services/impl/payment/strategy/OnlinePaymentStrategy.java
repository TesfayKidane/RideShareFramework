package rideshare.framework.services.impl.payment.strategy;

import rideshare.framework.services.impl.payment.factory.APaymentInfo;

public class OnlinePaymentStrategy implements IPaymentStrategy{

	@Override
	public boolean makePayment(APaymentInfo paymentInfo) {
		System.out.println("Payment Went Through Successfuly!");	
		System.out.println(paymentInfo.toString());
		return true;
	}

}
