package day2;

import javax.swing.JOptionPane;

public class Calculator3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b:"));
		
		JOptionPane.showMessageDialog(null, a+b);
	}
}
