public class HotDogStand extends Stand {
	HotDogStand(){super(null,1.25);}
	HotDogStand(String name, double price){super(name,price);};

	HotDogStand(HotDogStand obj) {
		super(obj.getName(),obj.getPrice());
	}

	public String toString(){return String.format("Hot dog stand:\nPrice per burger %.2f$",this.getPrice());}
	public boolean equals(Object obj){
		if (obj == null || !(obj instanceof HotDogStand))
			return false;
		else
			return super.equals(obj);
	}
}
