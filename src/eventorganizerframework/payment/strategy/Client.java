package eventorganizerframework.payment.strategy;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		PaymentModel pay=  new PaymentModel(); 
		Scanner inputPayment= new Scanner(System.in);
		System.out.println("Enter payment method please");
		String payment =inputPayment.nextLine();
		
		
		if ("CreditCard".equalsIgnoreCase(payment)){
			pay.setPaymentStragey(new CreditCardPayment());
			
		}
		else if ("DebitCard".equalsIgnoreCase(payment)){
			pay.setPaymentStragey(new DebitCardPayment());
		}
		
		else if ("Cash".equalsIgnoreCase(payment)){
			pay.setPaymentStragey(new CashPayment());
		}
		else if ("paypal".equalsIgnoreCase(payment)){
			pay.setPaymentStragey(new PaypalPayment());
		}
		
		
		pay.pay("50");
		
		
		inputPayment.close();
	}
	

}
