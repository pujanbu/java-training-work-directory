package assign2;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = input.nextInt();
		System.out.println("Enter number b:");
		int b = input.nextInt();
		
		int sum= a+b;
		int avg= sum/2;
		
		System.out.println("Sum of "+a+" and "+b+" is: "+ sum);
		System.out.println("Average of "+a+" and "+b+" is: "+ avg);
		
		
	}

}
