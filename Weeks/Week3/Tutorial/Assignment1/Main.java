public class Main{
	public static void main(String[] args){
		Person per1 = new Person();
		Person per2 = new Person("Emre", 20);

		System.out.println(per1);
		System.out.println(per2);
		System.out.printf("per1 == per2 -> %s", per1.equals(per2) ? "true" : "false");

		per1.setName("Emre");
		per1.setAge(20);

		System.out.println(per1);
		System.out.println(per2);
		System.out.printf("per1 == per2 -> %s", per1.equals(per2) ? "true" : "false");
	}
};
