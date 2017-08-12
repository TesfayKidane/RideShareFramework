package rideshare.framework.services.impl.payment.factory;

import rideshare.framework.services.impl.payment.PaymentType;

public interface IPaymentInfoFactory {
	public APaymentInfo createPaymentInfo(PaymentType paymentType);
}
