// Packages

package mainPackage;

// Imports

import java.util.Scanner;

import javax.swing.SwingUtilities;

import basicGames.gameSelection;

public class MainProgram {
	String user;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Window win = new Window();
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				gameSelection game = new gameSelection();
			}
			
		});
		

	}

}

