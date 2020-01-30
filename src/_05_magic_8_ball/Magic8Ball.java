//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;
import javax.swing.JOptionPane;
public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int e = 0;
Random ran = new Random();
e = ran.nextInt(4);
	// 3. Print out this variable
System.out.println(e);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Ask a question");
	// 5. If the random number is 0
if(e == 0) {
	JOptionPane.showMessageDialog(null, "yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
else if(e == 1) {
	JOptionPane.showMessageDialog(null, "no");
}
	// -- tell the user "No"

	// 7. If the random number is 2
else if(e == 2) {
	JOptionPane.showMessageDialog(null, "Maybe You Should Ask Google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
else if(e == 3) {
	JOptionPane.showMessageDialog(null, "Maybe");
}
	// -- write your own answer
	}
}
