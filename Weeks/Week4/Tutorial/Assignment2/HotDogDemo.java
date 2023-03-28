public class HotDogDemo{
	public static void main(String[] args){
		HotDogStand hs1 = new HotDogStand(0,0), hs2 = new HotDogStand(0,0), hs3 = new HotDogStand(0,9),hs4 = new HotDogStand(0,0);
		hs1.justSold();

		System.out.printf("Hotdogs sold by stand1 is %d\n",hs1.getSoldHotDogs());
		System.out.printf("Hotdogs sold by stand2 is %d\n",hs2.getSoldHotDogs());
		System.out.printf("Hotdogs sold by stand3 is %d\n",hs3.getSoldHotDogs());
		System.out.printf("Hotdogs sold by stand4 is %d\n",hs4.getSoldHotDogs());
		System.out.printf("Total hotdogs sold by every stand is %d\n",HotDogStand.getTotalHotDogsSold());

	}
};
