// Packages

package basicGames;

//Imports

import java.util.Scanner;

public class gameSelection {
	Scanner sc = new Scanner(System.in);

	public gameSelection() {
		System.out.println(
				"What game would you like to play? [TicTacToe; (Wip) Chess;(Wip) Checkers;(Wip) ThermalNuclearWar]");

		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("TicTacToe")) {
			TicTacToe tick = new TicTacToe();
		} else {
			System.out.println("That was either not an option or a non finished game. Game selection terminated.....");
		}
	}

}
