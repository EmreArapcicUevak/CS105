public class Team{
	private String teamName;
	private String[] memberNames = new String[4];
	private Competition[] competitions = new Competition[2];

	public Team(Team obj){
		this(obj.teamName, obj.memberNames, obj.competitions);
	}
	
	public Team(String teamName, String[] memberNames, Competition[] competitions){
		setTeamName(teamName);
		setMemberNames(memberNames);
		setCompetition(competitions);
	}

	public void setTeamName(String teamName){
		if (teamName != null)
			this.teamName = teamName;
		else
			this.teamName = "No Name";
	}

	public void setMemberNames(String[] memberNames){
		if (memberNames != null && memberNames.length == 4)
			for (int i = 0; i < 4; i++)
				this.memberNames[i] = memberNames[i];
		else if(this.memberNames == null)
			for (int i = 0; i < 4; i++)
				this.memberNames[i] = "No Name";
	}

	public void setCompetition(Competition[] competition){
		if (competition != null && competition.length == 2)
			for (int i = 0; i < competition.length; i++)
				this.competitions[i] = new Competition(competition[i]);
		else if(this.competitions == null)
			for (int i = 0; i < competition.length; i++)
				this.competitions[i] = new Competition();
	}

	public Competition[] getCompetition(){
		Competition[] returningValue = new Competition[this.competitions.length];
		for (int i = 0; i < returningValue.length; i++)
			returningValue[i] = new Competition(this.competitions[i]);

		return returningValue;
	}

	public String[] getMemberNames(){
		String[] returningValue = new String[this.memberNames.length];
		for (int i = 0; i < returningValue.length; i++)
			returningValue[i] = new String(this.memberNames[i]);

		return returningValue;
	}

	public String getTeamName(){return this.teamName;}

	public boolean equals(Object obj){
		if (obj != null && obj.getClass() == this.getClass()){
			Team cObj = (Team) obj;

			for (int i = 0; i < this.memberNames.length; i++)
				if (!this.memberNames[i].equals(cObj.memberNames[i]))
					return false;

			for (int i = 0; i < this.competitions.length; i++)
				if (!this.competitions[i].equals(cObj.competitions[i]))
					return false;

			return this.teamName.equals(cObj.teamName);
		}else
			return false;
	}

	public String toString(){
		return String.format("Team Name: %s\nMember Names:\n\t1: %s\n\t2: %s\n\t3: %s\n\t4: %s\nCompetitions:\n----------\n%s\n----------\n%s\n----------", teamName, memberNames[0],memberNames[1],memberNames[2],memberNames[3],competitions[0].toString(),competitions[1].toString());
	}

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
