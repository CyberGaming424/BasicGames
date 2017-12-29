// Packages

package basicGames;

//Imports

import java.util.Scanner;

public class gameSelection {
	Scanner sc = new Scanner(System.in);
	
	public gameSelection() {
		System.out.println("What game would you like to play? [TicTacToe; (Wip) Chess; Checkers; ThermalNuclearWar]");
		
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("TicTacToe")) {
			TicTacToe tick = new TicTacToe();
		}
		else {
			System.out.println("That was not an option. Game selection terminated.....");
		}
	}

}
