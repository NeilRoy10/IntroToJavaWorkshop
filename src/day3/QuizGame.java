package day3;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int correct = 0;
		String ans1 = JOptionPane.showInputDialog(null, "what is 10 + 10");
		if (ans1.equals("20")) {
			correct = correct + 1;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String ans2 = JOptionPane.showInputDialog(null, "what is patrick");
		if (ans2.equals("gay")) {
			correct = correct + 1;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String ans3 = JOptionPane.showInputDialog(null, "what is 8 + 5 x 5");
		if (ans3.equals("33")) {
			correct = correct + 1;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String ans4 = JOptionPane.showInputDialog(null, "what is the square root of 16");
		if (ans4.equals("4")) {
			correct = correct + 1;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String ans5 = JOptionPane.showInputDialog(null, "on a scale of 1-10 how gay is patrick");
		if (ans5.equals("69")) {
			correct = correct + 1;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		JOptionPane.showMessageDialog(null, "you got " + correct + "/5 correct");

	}
}
