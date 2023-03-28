public class CevabdzinicaDemo {
	public static void main(String[] args){
		Cevabdzinica shop1 = new Cevabdzinica("Limenka", "8am - 8pm", 10), shop2 = new Cevabdzinica("Sarajka", "8am - 5pm", -4);

		System.out.println(shop1);
		System.out.println(shop2);

		for (int i = 0; i < 1000; i++)
			shop2.portionSold();

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(shop1);
		System.out.println(shop2);



		System.out.printf("shop1.calculateProfit() -> %f\n", shop1.calculateProfit());
		System.out.printf("shop2.calculateProfit() -> %f\n", shop2.calculateProfit());
		System.out.printf("shop1.calculateProfitAll() -> %f\n", shop1.calculateProfitAll());
		System.out.printf("shop2.calculateProfitAll() -> %f\n", shop2.calculateProfitAll());
		System.out.printf("Cevabdzinica.calculateProfitAll() -> %f\n", Cevabdzinica.calculateProfitAll());

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("shop1.equals(shop2) -> %s", shop1.equals(shop2) ? "true" : "false");
	}
};
