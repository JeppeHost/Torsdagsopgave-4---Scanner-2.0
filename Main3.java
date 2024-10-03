import java.util.ArrayList;

public class Main3{
	public static void main(String [] args){
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu menu = new GameMenu(actions);
		String userChoice = menu.getAction();
		int intUserChoice = Integer.parseInt(userChoice);
		doAction(intUserChoice);

	}
	public static void doAction(int intUserChoice){

		switch(intUserChoice){
			case 1:
				System.out.println("Starting the game now.");
				break;
			case 2:
				System.out.println("Fetching previously saved game data.");
				break;
			case 3:
				System.out.println("Game paused.");
				break;
			case 4:
				System.out.println("Ending game");
				break;
			default:
				System.out.println("Invalid input. Please choose a valid option.");
				break;
		}
	}
}

