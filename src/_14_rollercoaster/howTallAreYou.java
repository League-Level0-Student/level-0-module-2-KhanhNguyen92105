package _14_rollercoaster;

import javax.swing.JOptionPane;

public class howTallAreYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String height = JOptionPane.showInputDialog(null, "How Tall Are you?");
int height1 = Integer.parseInt(height);
if(height1 >= 48) {
	JOptionPane.showMessageDialog(null, "You May Proceed");
}

if(height1 < 48) {
	JOptionPane.showMessageDialog(null, "Short");
}




}
	}

