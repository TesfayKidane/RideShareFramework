package framework.payment.strategy;

public class DebitCardPayment implements Payment {

	@Override
	public void makePayment(String amount) {
		System.out.println("Customer pays the money "+ amount +" using Debit Card ");

	}

}
