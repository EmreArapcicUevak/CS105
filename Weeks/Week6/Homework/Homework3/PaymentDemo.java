public class PaymentDemo{
	public static void main(String[] args){
		CashPayment CashPay1 = new CashPayment(50), CashPay2 = new CashPayment(50);

		System.out.println(CashPay1.paymentDetails());
		System.out.println(CashPay2.paymentDetails());
		System.out.println(CashPay2.equals(CashPay1));


		CreditCardPayment CreditCardPay1 = new CreditCardPayment(500, "Emre", "2024-10-14",null), CreditCardPay2 = new CreditCardPayment(1000, "Selma", "2024-4-1", null);
		System.out.println(CreditCardPay1.paymentDetails());
		System.out.println(CreditCardPay2.paymentDetails());
		System.out.println(CreditCardPay2.equals(CreditCardPay1));

		
		System.out.println(CashPay1);
		System.out.println(CreditCardPay1);
	}
};
