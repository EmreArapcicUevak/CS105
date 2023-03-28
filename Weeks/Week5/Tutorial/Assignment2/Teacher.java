public class Teacher extends Person{
	private String subjectName;
	private double salary;

	public Teacher(String firstName, String lastName, String subjectName, double salary){
		super(firstName,lastName);
		setSubjectName(subjectName);
		setSalary(salary);
	}

	public void setSubjectName(String subjectName){
		if (subjectName == null)
			this.subjectName = "None";
		else
			this.subjectName = subjectName;
	}

	public void setSalary(double salary){
		if (salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
	}

	public String getSubjectName(){return this.subjectName;}
	public double getSalary(){return this.salary;}

	public String displayDetail(){
		return String.format("%s\nSubject Name: %s\nSalary: %f", super.displayDetail(), subjectName, salary);
	}

	public boolean equals(Object Obj){
		if (super.equals(Obj)){
			Student nObj = (Student) Obj;
			return this.subjectName.equals(nObj.subjectName) && this.salary == nObj.salary;
		}else
			return false;
	}
};
