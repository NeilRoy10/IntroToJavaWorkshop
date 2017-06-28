package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String ans = JOptionPane.showInputDialog(null, "enter an adjetive");
		// Get the user to enter a type of liquid
String ans2 = JOptionPane.showInputDialog(null, "enter a type of luquid");
		// Get the user to enter a body part
String ans3 = JOptionPane.showInputDialog(null, "enter a body part");
		// Get the user to enter a verb
String ans4 = JOptionPane.showInputDialog(null, "enter a verb");
		// Get the user to enter a place
String ans5 = JOptionPane.showInputDialog(null, "enter a place");


		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String story = ("Piranhas are more "+ans+" during the day so cross the river at night. Piranhas are attracted to fresh "+ans2+" and will mostlikely take a bite out of your "+ans3+" if you "+ans4+" Whatever you do, if you have an open wound, try to find another way to get back to the "+ans5+". Good Luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, story);

	}
}

