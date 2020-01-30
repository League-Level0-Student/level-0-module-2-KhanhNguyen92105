package _06_lottery_numbers;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int e = 0;
Random ran = new Random();
e = ran.nextInt(6);

if(e == 4) {
	JOptionPane.showMessageDialog(null, "Winner");
}
else if(e == 2) {
	JOptionPane.showMessageDialog(null, "Lost");

}
else if(e == 3) {
	JOptionPane.showMessageDialog(null, "Lost");
}
else if(e == 5) {
	JOptionPane.showMessageDialog(null, "Lost");
}
	}

}
