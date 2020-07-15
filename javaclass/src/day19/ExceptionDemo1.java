package day19;

import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a num:;");
		int a = input.nextInt();
		System.out.println("num 2::");
		int b= input.nextInt();
	
		double rs= divide(a,b);
		System.out.println("ans::"+rs);
	}
	
	public static double divide (int a , int b) {
	return a/b;
	}

}
