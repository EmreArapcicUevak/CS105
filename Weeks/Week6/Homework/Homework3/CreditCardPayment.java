public class CreditCardPayment extends Payment{
	public String nameOnTheCard, expirationDate, creditCardNumber;
	
	public CreditCardPayment(){this(0,null,null,null);}
	public CreditCardPayment(double payment, String nameOnTheCard, String expirationDate, String creditCardNumber){
		super(payment);
		setNameOnTheCard(nameOnTheCard);
		setExpirationDate(expirationDate);
		setCreditCardNumber(creditCardNumber);
	}

	public void setNameOnTheCard(String nameOnTheCard){
		if (nameOnTheCard == null)
			this.nameOnTheCard = "John Doe";
		else
			this.nameOnTheCard = nameOnTheCard;
	}

	public void setExpirationDate(String expirationDate){
		if (expirationDate == null)
			this.expirationDate = "2000-00-00";
		else
			this.expirationDate = expirationDate;
	}

	public void setCreditCardNumber(String creditCardNumber){
		if (creditCardNumber == null)
			this.creditCardNumber = "xxxx-xxxx-xxxx";
		else
			this.creditCardNumber = creditCardNumber;
	}

	public String getNameOnTheCard(){return this.nameOnTheCard;}
	public String getExpirationDate(){return this.expirationDate;}
	public String getCreditCardNumber(){return this.creditCardNumber;}

	public String paymentDetails(){
		return String.format("Credit Card payment of %.2f$ was made.\nThe name on the card is %s\nThe Credit Card Number is %s\nTheCredit Card Expiration date is %s", super.getPayment(), nameOnTheCard, expirationDate, creditCardNumber);
	}

	public boolean equals(Object obj){
		if (obj != null && obj.getClass() == this.getClass()){
			CreditCardPayment cObj = (CreditCardPayment) obj;
			return super.equals(obj) && cObj.nameOnTheCard.equals(nameOnTheCard) && cObj.expirationDate.equals(expirationDate) && cObj.creditCardNumber.equals(creditCardNumber);
		} else
			return false;
	}

	public String toString(){
		return String.format("Payment: %f\nName on the credit card: %s\nCredit Card Number: %s\nExpiration Date: %s",super.getPayment(),nameOnTheCard,expirationDate,creditCardNumber);}
};
