public class Person {
	private String name;
	private int age;

	public Person(){
		setName("John Doe");
		setAge(0);
	}

	public Person(String name , int age ){
		setName(name);
		setAge(age);
	}

	public void setName(String name) {
		if (name == null || name.equals(""))
			this.name = "John Doe";
		else
			this.name = name;
	}

	public void setAge(int age){
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	public boolean equals(Person obj){
		if (obj == null)
			return false;
		else
			return age == obj.age && name.equals(obj.name);
	}

	public String toString(){
		return "Person called: " + this.name + '\n' + "Their age is: " + this.age + '\n';
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}
};
