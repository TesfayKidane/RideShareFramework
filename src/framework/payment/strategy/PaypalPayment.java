package framework.payment.strategy;

public class PaypalPayment implements Payment {

	@Override
	public void makePayment(String amount) {
		System.out.println("Customer pays the money "+ amount +" by Paypal ");

	}

}
