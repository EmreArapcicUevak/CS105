public class Cevabdzinica{
	private String name, workingHours;
	private int numSold;
	static private int totalSold = 0;

	public Cevabdzinica(String name, String workingHours, int numSold){
		setName(name);
		setWorkingHours(workingHours);
		setPortionSold(numSold);
	}

	public void setName(String name){
		if (name == null)
			this.name = "No Name";
		else
			this.name = name;
	}

	public void setWorkingHours(String workingHours){
		if (workingHours == null)
			this.workingHours = "No Name";
		else
			this.workingHours = workingHours;
	}

	private void setPortionSold(int numSold){
		if (numSold <= 0)
			this.numSold = 0;
		else{
			this.numSold = numSold;
			totalSold += numSold;
		}
	}

	public String getName(){return this.name;}
	public String getWorkingHours(){return this.workingHours;}
	public int getPortionsSold(){return this.numSold;}
	public int getAllPortionsSold(){return this.totalSold;}

	public void portionSold(){
		this.numSold++;
		this.totalSold++;
	}

	public double calculateProfit(){return this.numSold * 8.5;}
	public static double calculateProfitAll(){return Cevabdzinica.totalSold * 8.5;}

	public String toString(){
		return String.format("Name: %s\nWorking Hours: %s\nPortions Sold: %s\nTotal Portions Sold: %s", name, workingHours, numSold, totalSold);
	}

	public boolean equals(Object otherP){
		if (otherP != null && otherP.getClass() == this.getClass()){
			Cevabdzinica cObj = (Cevabdzinica) otherP;

			return cObj.name.equals(name) && cObj.workingHours.equals(workingHours) && cObj.numSold == numSold;
		}else
			return false;
	}
};
