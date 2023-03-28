public class TeamDemo{
	public static void main(String[] args){
		Competition[] competitions = {new Competition("International Olympiad in Informatics",2033),
		new Competition("Call For Code IBM",2033)};

		Team team1 = new Team("Matrix", new String[]{"Emre", "Vedad", "Ammar", "Omer"},competitions);
		Team team2 = new Team("Inverse Matrix", new String[]{"Selma", "Adna", "Fatima", "Lejla"},competitions);

		System.out.println(team1);
		System.out.println(team2);

		System.out.printf("team1.equals(team2) = %s", team1.equals(team2) ? "true" : "false");
	}
};
