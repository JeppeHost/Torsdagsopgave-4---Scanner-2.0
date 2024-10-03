import java.util.ArrayList;

public class Team{
	
	private String teamName;

	private int teamRank;

	private ArrayList<String> playerNames = new ArrayList<>();

	public Team(String teamName){
		this.teamName = teamName;
		
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}


	public String toString(){

		String playerNamesString = "";

		for(int i = 0; i < playerNames.size();i++){
			playerNamesString += "\n" + playerNames.get(i);


		}

		return "Team: " + teamName + ", Rank: " + teamRank + "Playernames:" + playerNamesString;
	}

	public void addPlayer(String name){
		this.playerNames.add(name);
	}

}