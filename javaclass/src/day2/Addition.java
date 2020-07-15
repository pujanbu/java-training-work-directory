package day2;

import java.util.Scanner;

public class Addition {
	public void sum() {
		int a = 5;
		int b = 6;
		int add = a + b;
		System.out.println("sum is :: " + add);
	}
	public void sum(int a, int b) {
		int add = a+b;
		System.out.println("Sum is :"+add);
		
	}
	public void sum(double a, double b) {
		double add = a+b;
		System.out.println("Sum is :"+add);
	}
	public static void main(String[] args) {
		Addition addition= new Addition();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number");
		 
	}
}
