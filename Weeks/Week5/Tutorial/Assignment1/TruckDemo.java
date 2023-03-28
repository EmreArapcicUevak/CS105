public class TruckDemo{
	public static void main(String[] args){
		Truck t1 = new Truck("BMW", "X33O", 2004, 50);
		Truck t2 = new Truck("BMW", "X33O", 2004, 50);

		System.out.println(t1);
		System.out.println(t2);

		System.out.println(String.format("t1.equals(t2) -> %s", t1.equals(t2) ? "true" : "false"));
		System.out.println(t2.getClass());
	}
};
