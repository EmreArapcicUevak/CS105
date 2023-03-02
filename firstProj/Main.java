public class Main {
	public static void main(String[] args){
		Counter c = new Counter(4);

		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
	}
};
