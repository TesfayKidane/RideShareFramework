package rideshare.framework.services.impl.payment;

import rideshare.framework.services.IPaymentService;
import rideshare.framework.services.impl.payment.factory.APaymentInfo;
import rideshare.framework.services.impl.payment.strategy.IPaymentStrategy;
import rideshare.framework.services.impl.payment.strategy.PaymentMethod;

public class PaymentServiceImpl implements IPaymentService{

	@Override
	public boolean pay(APaymentInfo paymentInfo, IPaymentStrategy paymentStrategy) {
			PaymentMethod paymentMethod = new PaymentMethod();
			paymentMethod.setPaymentStragey(paymentStrategy);
		return paymentMethod.pay(paymentInfo);
	}


}
