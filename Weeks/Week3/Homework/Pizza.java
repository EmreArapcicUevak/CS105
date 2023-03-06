public class Pizza{
	private String pizzaSize;
	private int numberOfPepperoniToppings,numberOfCheeseToppings;

	Pizza(){this("small",0,0);}

	Pizza(String pizzaSize,int numberOfPepperoniToppings, int numberOfCheeseToppings){
		setPizzaSize(pizzaSize);
		setNumberOfPepperoniToppings(numberOfPepperoniToppings);
		setNumberOfCheeseToppings(numberOfCheeseToppings);
	}

	public void setPizzaSize(String pizzaSize){
		if (pizzaSize == null)
			this.pizzaSize = "small";
		else{
			pizzaSize = pizzaSize.toLowerCase();
			if (pizzaSize.equals("small") && pizzaSize.equals("medium") && pizzaSize.equals("large"))
				this.pizzaSize = "small";
			else
				this.pizzaSize = pizzaSize;
		}
	}

	public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings){
		if (numberOfPepperoniToppings > 0)
			this.numberOfPepperoniToppings = numberOfPepperoniToppings;
		else
			this.numberOfPepperoniToppings = 0;
	}

	public void setNumberOfCheeseToppings(int numberOfCheeseToppings){
		if (numberOfCheeseToppings > 0)
			this.numberOfCheeseToppings = numberOfCheeseToppings;
		else
			this.numberOfCheeseToppings = 0;
	}

	public String getPizzaSize() {return this.pizzaSize;}
	public int getNumberOfPepperoniToppings() {return this.numberOfPepperoniToppings;}
	public int getNumberOfCheeseToppings() {return this.numberOfCheeseToppings;}

	public double calcCost(){
		if (this.pizzaSize.equals("small"))
			return 10 + 2 * (this.numberOfCheeseToppings + this.numberOfPepperoniToppings);
		else if(this.pizzaSize.equals("medium"))
			return 12 + 2 * (this.numberOfCheeseToppings + this.numberOfPepperoniToppings);
		else
			return 14 + 2 * (this.numberOfCheeseToppings + this.numberOfPepperoniToppings);
	}

	public String getDescription(){
		return String.format("This is a %s pizza\nIt has %d cheese and %d pepperoni toppings\nIt's price is %.2f$", this.pizzaSize,
		this.numberOfCheeseToppings, this.numberOfPepperoniToppings, this.calcCost());
	}

	public String toString() {
		return String.format("Pizza Size: %s\nNumber Of Cheese Toppings: %d\nNumber Of Pepperoni Toppings: %d",
		this.pizzaSize, this.numberOfCheeseToppings, this.numberOfPepperoniToppings);
	}

	public boolean equals(Pizza obj) {
		if (obj == null)
			return false;
		else
			return this.pizzaSize.equals(obj.pizzaSize) && this.numberOfCheeseToppings == obj.numberOfCheeseToppings &&
			this.numberOfPepperoniToppings == obj.numberOfPepperoniToppings;
	}
};
