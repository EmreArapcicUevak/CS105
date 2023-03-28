public class Person{
	private String firstName, lastName;

	public Person(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}

	public void setFirstName(String firstName){
		if (firstName == null)
			this.firstName = "John";
		else
			this.firstName = firstName;
	}

	public void setLastName(String lastName){
		if (lastName == null)
			this.lastName = "Doe";
		else
			this.lastName = lastName;
	}

	public String getFirstName(){return this.firstName;}
	public String getLastName(){return this.lastName;}

	public String displayDetail(){return String.format("This Person is called: %s %s",this.firstName,this.lastName);}
	public boolean equals(Object Obj){
		if (Obj == null || getClass() != Obj.getClass())
			return false;
		else{
			Person nObj = (Person) Obj;
			return nObj.lastName.equals(lastName) && nObj.firstName.equals(firstName);
		}
	}
}
