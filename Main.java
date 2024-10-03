
public class Main{
	public static void main(String [] args){
		Team team1 = new Team("The unbeatable");
		team1.setRank(10);
		Team team2 = new Team("The unbeatable2");
		team2.setRank(11);
		Team team3 = new Team("The unbeatable3");
		team3.setRank(12);
		Team team4 = new Team("The unbeatable4");
		team4.setRank(13);
		Team team5 = new Team("The unbeatable5");
		team5.setRank(14);
		Team team6 = new Team("The unbeatable6");
		team6.setRank(15);


		team6.addPlayer("Jeppe");
		team6.addPlayer("Kristian");
		

		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		System.out.println(team6.toString());

		





	}

	}


