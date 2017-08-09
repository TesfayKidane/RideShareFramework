package eventorganizerframework.payment.strategy;

public class PaymentModel {
	private Payment paymentStrategy;

	public void setPaymentStragey(Payment paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void pay(String amount) {
		try {
			paymentStrategy.makePayment(amount);
		} catch (NullPointerException e) {
			System.out.println("there is no such payment method");

		}
	}
}
