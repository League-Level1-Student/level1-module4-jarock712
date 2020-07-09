package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;
import javax.swing.JOptionPane;
public class Magic8Ball {
	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int ran = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.print(ran);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask anything and the magic 8 ball shall answer!");
		// 5. If the random number is 0
		if (ran == 0) {
			JOptionPane.showMessageDialog(null, "Yes");// -- tell the user "Yes"
		}
		// 6. If the random number is 1
		if (ran == 1) {
			JOptionPane.showMessageDialog(null, "No");// -- tell the user "No"
		}
		// 7. If the random number is 2
		if (ran == 2) {
			JOptionPane.showMessageDialog(null, "Maybe ask google?");// -- tell the user "Maybe you should ask Google?"
		}
		// 8. If the random number is 3
		if (ran == 3) {
			JOptionPane.showMessageDialog(null, "You shall find this answer on your own");// -- write your own answer
		}
	}
}