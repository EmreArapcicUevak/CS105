public class HotDogStand{
	private int IDNumber, soldHotDogs;
	private static int totalSoldHotDogs = 0;

	public HotDogStand(){
		this(0, 0);	
	}

	public HotDogStand(int IDNumber, int soldHotDogs){
		setIDNumber(IDNumber);
		setSoldHotDogs(soldHotDogs);
	}


	private void setIDNumber(int IDNumber){
		if (IDNumber < 0)
			this.IDNumber = 0;
		else
			this.IDNumber = IDNumber;
	}

	private void setSoldHotDogs(int soldHotDogs){
		if (soldHotDogs < 0)
			this.soldHotDogs = 0;
		else
			this.soldHotDogs = soldHotDogs;

		totalSoldHotDogs += this.soldHotDogs;
	}

	public void justSold(){soldHotDogs++;totalSoldHotDogs++;}
	public int getSoldHotDogs(){return this.soldHotDogs;}
	public static int getTotalHotDogsSold(){return totalSoldHotDogs;}
};
