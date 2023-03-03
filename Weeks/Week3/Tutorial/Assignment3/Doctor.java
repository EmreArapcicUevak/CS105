public class Doctor{
	private String firstName, specialization;
	private int ID;
	private double salary;

	public Doctor(String firstName, String specialization, int ID, double salary){
		setFirstName(firstName);
		setSpecialization(specialization);
		setID(ID);
		setSalary(salary);
	}

	public String getFirstName() {return this.firstName;}
	public String getSpecialization() {return this.specialization;}
	public int getID() {return this.ID;}
	public double getSalary() {return this.salary;}

	public void setFirstName(String firstName){
		if (firstName == null || firstName.equals(""))
			this.firstName = "John Doe";
		else
			this.firstName = firstName;
	}

	public void setSpecialization(String specialization){
		if (specialization == null || specialization.equals(""))
			this.specialization = "Nothing";
		else
			this.specialization = specialization;
	}

	public void setID(int ID){
		if (ID < 0 || ID > 999999)
			this.ID = 0;
		else
			this.ID = ID;
	}

	public void setSalary(double salary){
		if (salary <= 0)
			this.salary = 0;
		else
			this.salary = salary;
	}

	public String toString(){
		return "First Name: " + this.firstName +
		"\nSpecialization: " + this.specialization +
		"\nID: " + this.ID +
		"\nSalary: " + this.salary;
	}

	public boolean equals(Doctor obj){
		if (obj == null)
			return false;
		else
			return obj.firstName.equals(this.firstName) && obj.specialization.equals(this.specialization) 
			&& obj.ID == this.ID && obj.salary == this.salary;
	}
};
