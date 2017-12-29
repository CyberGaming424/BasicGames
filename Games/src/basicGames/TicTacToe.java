// Package

package basicGames;

// Imports

import java.util.Scanner;

// Has no main function; can not run by it's self please refer to mainProgram in mainPackage to run the program.

public class TicTacToe {
	Scanner sc = new Scanner(System.in);
	boolean newGame;
	boolean turnOver;
	String row1;
	String row2;
	String row3;
	String row;
	String board;
	boolean gameOver;

	public TicTacToe() {
		System.out.println("Welcome to the game of TicTacToe.");
		rules();
		game();
	}

	void moves() {
		if (newGame == true) {
			row1 = "---";
			row2 = "---";
			row3 = "---";
			board = "Please choose a row: \n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
			System.out.println(board);
		}
		System.out.println("Please select a row: ");
		row = sc.nextLine();
		if (row.equals("1")) {
			row1 = sc.nextLine();
			board = "Current board: \n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
			System.out.println(board);
			turnOver = true;
		} else if (row.equals("2")) {
			row2 = sc.nextLine();
			board = "Current board: \n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
			System.out.println(board);
			turnOver = true;
		} else if (row.equals("3")) {
			row3 = sc.nextLine();
			board = "Current board: \n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
			System.out.println(board);
			turnOver = true;
		} else {
			System.out.print("Move invalid!");
			turnOver = true;
		}
		if (turnOver = true) {
			System.out.println("Has some won the game? [Y or N] ");
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				gameOver = true;
			}
			else if (answer.equalsIgnoreCase("N")) {
				board = "\n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
				System.out.println(board);
				newGame = false;
			}
		}
	}

	void game() {
		newGame = true;
		for (;;) {
			moves();
			board = "Please choose a row: \n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
			System.out.println(board);
			if (gameOver == true) {
				board = "\n" + "1. " + row1 + "\n" + "2. " + row2 + "\n" + "3. " + row3 + "\n";
				System.out.println("Winning board: " + board);
				break;
			}
		}
	}

	void rules() {
		System.out.println("Would you like to read the rules?");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Y")) {
			System.out.println("Test");
		}
	}

}
