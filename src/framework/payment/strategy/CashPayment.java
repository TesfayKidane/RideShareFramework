package framework.payment.strategy;

public class CashPayment implements Payment {
  
	@Override
	public void makePayment(String amount) {
		System.out.println("Customer pays the money "+ amount +" as Cash");
		
	}

}
