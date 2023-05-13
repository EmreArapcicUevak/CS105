public class BurgerStand extends Stand {
	BurgerStand(){super(null,2.5);}
	BurgerStand(String name, double price){super(name,price);};

	BurgerStand(BurgerStand obj) {
		super(obj.getName(),obj.getPrice());
	}

	public String toString(){return String.format("Burger Stand:\nPrice per burger %.2f$",this.getPrice());}
	public boolean equals(Object obj){
		if (obj == null || !(obj instanceof BurgerStand))
			return false;
		else
			return super.equals(obj);
	}
}
