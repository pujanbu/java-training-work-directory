package assign2;

import javax.swing.JOptionPane;


public class Ques4 {
	public static void main(String[] args) {
		int prin= Integer.parseInt(JOptionPane.showInputDialog("Enter the principle: "));
		int time= Integer.parseInt(JOptionPane.showInputDialog("Enter the time: "));
		int rate= Integer.parseInt(JOptionPane.showInputDialog("Enter the rate: "));
		int si= prin*time*rate/100;
		JOptionPane.showMessageDialog(null, "the interest is "+si);
		
	}

}
