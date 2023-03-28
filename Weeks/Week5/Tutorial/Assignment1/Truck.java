public class Truck extends Vehicle{
	private double tonnage;

	public Truck(String manufactureName,String vehicleModel,int yearOfManufacturing,double tonnage){
		super(manufactureName,vehicleModel,yearOfManufacturing);
		setTonnage(tonnage);
	}

	public void setTonnage(double tonnage){
		if (tonnage < 0)
			this.tonnage = 0;
		else
			this.tonnage = tonnage;
	}

	public double getTonnage(){return tonnage;}
	public String toString(){return String.format("%s\nTonnage: %f",super.toString(),this.tonnage);}
	public boolean equals(Object Obj){
		if (Obj == null || this.getClass() != Obj.getClass())
			return false;
		else{
			Truck objToCompare = (Truck)Obj; 
			return this.tonnage == objToCompare.tonnage && super.equals(Obj);
		}
	}
};
