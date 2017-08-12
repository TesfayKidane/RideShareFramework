package rideshare.framework.services;

import rideshare.framework.services.impl.payment.factory.APaymentInfo;
import rideshare.framework.services.impl.payment.strategy.IPaymentStrategy;

public interface IPaymentService {
	public boolean pay(APaymentInfo paymentInfo, IPaymentStrategy paymentStrategy);
}
