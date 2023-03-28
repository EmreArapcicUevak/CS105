public class Competition{
	private String name;
	private int yearOfCompetition;
	
	private void construct(String name, int yearOfCompetition){
		setName(name);
		setYearOfCompetition(yearOfCompetition);
	}

	public Competition(){
		this(null,0);
		System.out.println("Null Constructor called");
	}
	public Competition(String name, int yearOfCompetition){construct(name, yearOfCompetition);}

	public Competition(Competition Obj){
		if (Obj == null)
			construct(null,0);
		else
			construct(Obj.name, Obj.yearOfCompetition);
	}
	
	public void setName(String name){
		if (name == null)
			this.name = "No Name";
		else
			this.name = name;
	}
	
	public void setYearOfCompetition(int yearOfCompetition){
		if (yearOfCompetition <= 0)
			this.yearOfCompetition = 0;
		else
			this.yearOfCompetition = yearOfCompetition;
	}

	public String getName(){return this.name;}
	public int getYearOfCompetition(){return this.yearOfCompetition;}

	public boolean equals(Object obj){
		if (obj != null && obj.getClass() == this.getClass()){
			Competition cObj = (Competition) obj;
			
			return this.name.equals(cObj.name) && this.yearOfCompetition == cObj.yearOfCompetition;
		}else
			return false;

	}

	public String toString(){return String.format("Competiton name: %s\nYear Of The Competition: %d", name, yearOfCompetition);}
};
/*
You are interested in keeping track of the team members and competition information for your school's annual entries in computer science programming competitions. Each team consists of exactly four team members. Every year your team competes in two competitions. As an initial start for your database, create a class named Team that has the following instance variables:
// Name for the team
String teamName;
// Names for each team members.
String name1, name2, name3, name4;
// Info on each competition
Competition competition1, competition2;
Note that there is a much better way to represent the team members and competitions using arrays; this is covered in a subsequent chapter. The class should also have a method that outputs the names of all team members and the competition information to the console.

The Competition class contains variables to track the following:
String: Name of the competition, Name of the winning team, Name of the runner-up
Integer: Year of the competition
Implement the Team and Competition classes with appropriate constructor, accessor, and mutator methods. In entering data for past competitions, you note that an entry is usually very similar to the previous year's entry. To help with the data entry, create a deep copy constructor for the Team class. Test your copy constructor by creating a copy of an existing team object, changing the competition information for the copy, and outputting the data for the original and the copy. The original object should be unchanged if your deep copy constructor is working properly.

To test this, in main method ask user to enter data for Team a1. Once done, make a deep copy of a1 and store it in a2. Ask user to change the name of a2 and name of competition 2 of team 2. Now print a1 and a2 data on screen. */
