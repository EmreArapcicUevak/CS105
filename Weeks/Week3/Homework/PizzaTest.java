import java.util.Scanner;

public class PizzaTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of Pizza: ");
		String size = input.nextLine();

		System.out.print("Enter the number of Cheese toppings: ");
		int nOfCheTop = input.nextInt();

		System.out.print("Enter the number of Pepperoni toppings: ");
		int nOfPepTop = input.nextInt();   

		Pizza orderedPizza = new Pizza(size, nOfPepTop, nOfCheTop);
		Pizza defaultPizza = new Pizza();

		System.out.printf("================================================================================\n");
		System.out.printf("================================================================================\n");

		System.out.printf("Ordered Pizza Description:\n%s\n",orderedPizza.getDescription());
		System.out.printf("================================================================================\n");
		System.out.printf("Default Pizza Description:\n%s\n",defaultPizza.getDescription());

		System.out.printf("================================================================================\n");
		System.out.printf("================================================================================\n");

		System.out.printf("Ordered Pizza toString:\n%s\n",orderedPizza.toString());
		System.out.printf("================================================================================\n");
		System.out.printf("Default Pizza toString:\n%s\n",defaultPizza.toString());

		System.out.printf("================================================================================\n");
		System.out.printf("================================================================================\n");
		System.out.printf("orderedPizza.equals(defaultPizza) -> %s",orderedPizza.equals(defaultPizza) ? "true" : "false");
	}
};
