public class Student{
	private String firstName;
	private int ID;
	private double GPA;

	public Student(String firstName, int ID, double GPA){
		setFirstName(firstName);
		setID(ID);
		setGPA(GPA);
	}

	public void setFirstName(String firstName){
		if (firstName == null || firstName.equals(""))
			this.firstName = "John Doe";
		else
			this.firstName = firstName;
	}

	public void setID(int ID){
		if (ID < 0 || ID > 9999)
			this.ID = 0;
		else
			this.ID = ID;
	}

	public void setGPA(double GPA){
		if (GPA >= 0.0 && GPA <= 4.0)
			this.GPA = GPA;
		else
			this.GPA = 0;
	}

	public String getFirstName(){return this.firstName;}
	public int getID(){return this.ID;}
	public double getGPA(){return this.GPA;}

	public String toString(){
		return "First Name: " + this.firstName +
		"\nID: " + this.ID + 
		"\nGPA: " + this.GPA;
	}

	public boolean equals(Student obj){
		if (obj == null)
			return false;
		else
			return obj.firstName.equals(this.firstName) && obj.ID == this.ID && obj.GPA == this.GPA;
	}
};
