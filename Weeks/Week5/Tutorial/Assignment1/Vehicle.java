public class Vehicle{
	private String manufactureName, vehicleModel;
	private int yearOfManufacturing;

	Vehicle(String manufactureName, String vehicleModel, int yearOfManufacturing){
		setManufactureName(manufactureName);
		setVehicleModel(vehicleModel);
		setYearOfManufacturing(yearOfManufacturing);
	}

	public void setManufactureName(String manufactureName){
		if (manufactureName == null || manufactureName.equals(""))
			this.manufactureName = "No Name";
		else
			this.manufactureName = manufactureName;
	}

	public void setVehicleModel(String vehicleModel){
		if (vehicleModel == null || vehicleModel.equals(""))
			this.vehicleModel = "No Name";
		else
			this.vehicleModel = vehicleModel;
	}

	public void setYearOfManufacturing(int yearOfManufacturing){
		if (yearOfManufacturing < 0)	
			this.yearOfManufacturing = 0;
		else
			this.yearOfManufacturing = yearOfManufacturing;
	}

	public String getManufactureName(){return this.manufactureName;}
	public String getVehicleModel(){return this.vehicleModel;}
	public int  getYearOfManufacturing(){return this.yearOfManufacturing;}

	public String toString(){return String.format("Manufacture Name: %s\nVehicle Model: %s\nYear of manufacturing: %d",
	manufactureName,vehicleModel,yearOfManufacturing);}

	public boolean equals(Object Obj){
		if (Obj == null || this.getClass() != Obj.getClass())
			return false;
		else{
			Vehicle objToCompare = (Vehicle)Obj; 
			return this.manufactureName.equals(objToCompare.manufactureName) 
			&& this.vehicleModel.equals(objToCompare.vehicleModel) 
			&& this.yearOfManufacturing == objToCompare.yearOfManufacturing;
		}
	}
};
