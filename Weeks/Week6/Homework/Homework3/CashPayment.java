public class CashPayment extends Payment{
	public CashPayment(double payment){super(payment);}
	public CashPayment(){super();}

	public String paymentDetails(){return String.format("The total payment is %.2f$. In Cash", super.getPayment());}
};
