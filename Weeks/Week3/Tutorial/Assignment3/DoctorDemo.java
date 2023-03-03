public class DoctorDemo{
	static public void main(String[] args){
		Doctor doc1 = new Doctor("Emre", "Neuro Surgeon", 5, 900);	
		Doctor doc2 = new Doctor("Emre", "Neuro Surgeon", 6, 900);	

		System.out.println(doc1);
		System.out.println(doc2);
		System.out.printf("doc1.equals(doc2) = %s\n", doc1.equals(doc2) ? "true" : "false");

		doc2.setID(5);
		System.out.println(doc1);
		System.out.println(doc2);
		System.out.printf("doc1.equals(doc2) = %s\n", doc1.equals(doc2) ? "true" : "false");
	}
};
