public class StandDemo{
	public static void main(String[] args){
		BurgerStand JohnBurger = new BurgerStand("John Burgers", 2.5);
		HotDogStand ColdDogs = new HotDogStand("Cold Dogs",1.25);

		BurgerStand JohnBurgerCopy = new BurgerStand(JohnBurger);
		HotDogStand ColdDogsCopy = new HotDogStand(ColdDogs);

		System.out.println(String.format("JohnBurger.getName() -> %s\n",JohnBurger.getName()));
		System.out.println(String.format("ColdDogs.getName() -> %s\n",ColdDogs.getName()));
		
		System.out.println(String.format("JohnBurger.equals(JohnBurgerCopy) -> %s\n",JohnBurger.equals(JohnBurgerCopy) ? "true" : "false"));
		System.out.println(String.format("ColdDogs.equals(ColdDogsCopy) -> %s \n",ColdDogs.equals(ColdDogsCopy) ? "true" : "false"));

		System.out.println(JohnBurger);
		System.out.println(ColdDogs);

		System.out.printf("JohnBurger.calculate(5) -> %.2f$\n",JohnBurger.calculate(5));
		System.out.printf("ColdDogs.calculate(5) -> %.2f$\n",ColdDogs.calculate(5));
	}
}
