package framework.payment.strategy;

public class CreditCardPayment implements Payment {

	@Override
	public void makePayment(String amount) {
		System.out.println("Customer pays the money "+ amount +" using Credit Card ");

	}

}
