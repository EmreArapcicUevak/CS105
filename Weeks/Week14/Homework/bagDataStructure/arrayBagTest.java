public class arrayBagTest{
	public static void main(String[] args){
		ArrayBag<String> myBag = new ArrayBag<String>(100);
		System.out.println(String.format("myBag.isFull() -> %s",myBag.isFull() ? "true" : "false"));
		System.out.println(String.format("myBag.isEmpty() -> %s", myBag.isEmpty() ? "true" : "false"));
		System.out.println(String.format("myBag.getCurrentSize() -> %d", myBag.getCurrentSize()));

		myBag.add("Calculus 3 book");
		myBag.add("Calculus 2 book");
		myBag.add("Calculus 1 book");
		System.out.println("myBag.add(\"Calculus 3 book\")");
		System.out.println("myBag.add(\"Calculus 2 book\")");
		System.out.println("myBag.add(\"Calculus 1 book\")");

		System.out.println(String.format("myBag.isFull() -> %s",myBag.isFull() ? "true" : "false"));
		System.out.println(String.format("myBag.isEmpty() -> %s", myBag.isEmpty() ? "true" : "false"));
		System.out.println(String.format("myBag.getCurrentSize() -> %d", myBag.getCurrentSize()));

		System.out.println(String.format(String.format("myBag.contains(\"Calculus 2 book\") -> %s", myBag.contains("Calculus 2 book") ? "true" : "false")));
		System.out.println(String.format("myBag.getFrequencyOf(\"Calculus 2 book\")", myBag.getFrequencyOf("Calculus 2 book")));
	
		System.out.println("myBag.display():");
		myBag.display();

		System.out.println(String.format("myBag.remove() -> %s", myBag.remove()));

		System.out.println("myBag.display():");
		myBag.display();

		System.out.println(String.format("myBag.remove(\"Calculus 1 book\") -> %s", myBag.remove("Calculus 1 book") ? "true" : "false"));

		System.out.println("myBag.display():");
		myBag.display();

		System.out.println("myBag.clear()");
		myBag.clear();

		System.out.println("myBag.display():");
		myBag.display();

	}
}
