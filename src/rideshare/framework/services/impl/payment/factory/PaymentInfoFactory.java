package rideshare.framework.services.impl.payment.factory;

import rideshare.framework.services.impl.payment.PaymentType;

public class PaymentInfoFactory implements IPaymentInfoFactory {
	public static PaymentInfoFactory paymentInfoFactory = new PaymentInfoFactory();

	private PaymentInfoFactory() {
	}

	public static PaymentInfoFactory getInstance() {
		return paymentInfoFactory;
	}

	@Override
	public APaymentInfo createPaymentInfo(PaymentType paymentType) {
		if (PaymentType.CREDITCARD == paymentType) {
			return new CreditCardPaymentInfo();
		} else if (PaymentType.DEBITCARD == paymentType) {
			return new DebitCardPaymentInfo();
		}
		else if (PaymentType.ONLINEPAYMENT == paymentType) {
			return new OnlinePaymentInfo();
		} else if (PaymentType.PAYPAL == paymentType) {
			return new PaypalPaymentInfo();
		} else if (PaymentType.CASH == paymentType) {
			return new CashPaymentInfo();
		}
		return null;
	}

}
