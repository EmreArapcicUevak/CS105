public class Stand{
	String name;
	double price;

	public Stand(){this(null,0);}
	public Stand(String name, double price){
		setName(name);
		setPrice(price);
	}

	public void setName(String name){
		if (name == null || name.equals(""))
			this.name = "No Name";
		else
			this.name = name;
	}

	public void setPrice(double price){
		if (price >= 0)
			this.price = price;
		else
			this.price = 0;
	}

	public String getName(){return this.name;}
	public double getPrice(){return this.price;}

	public String toString(){return String.format("Stand\nPrice per order: %.2f$",this.price);}
	double calculate(int amount){return amount * price;}
	public boolean equals(Object obj){
		if (obj == null || !(obj instanceof Stand))
			return false;
		else{
			Stand cObj = (Stand)obj;
			return cObj.name.equals(this.name) && cObj.price == this.price;
		}
	}
}
