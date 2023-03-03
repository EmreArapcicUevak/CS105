public class StudentDemo{
	public static void main(String[] args){
		Student s1 = new Student("Emre", 1,4.0), s2 = new Student("Emre", 2, 3.8);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.printf("s1.equals(s2) = %s", s1.equals(s2) ? "true" : "false");
	}
};
