package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = JOptionPane.showInputDialog("how old are you");
int age1 = Integer.parseInt(age);
if(age1 >= 18) {
	JOptionPane.showInputDialog("which canidate do you vote for?");
}
if(age1 < 18) {
	JOptionPane.showMessageDialog(null, "You have a invalid opinion");
}
	}

	
}
