public class Payment {
	private double payment;

	public Payment(double payment){setPayment(payment);}
	public Payment(){this(0);}

	public void setPayment(double payment){
		if (payment <= 0)
			this.payment = 0;
		else
			this.payment = payment;
	}

	public double getPayment(){return this.payment;}
	public boolean equals(Object obj){
		if (obj != null && obj.getClass() == this.getClass()){
			Payment cObj = (Payment) obj;
			return cObj.payment == this.payment;
		}else
			return false;
	}

	public String paymentDetails(){return String.format("The payment is %.2f$",this.payment);}
	public String toString(){return String.format("Payment %.2f", payment);}
};
