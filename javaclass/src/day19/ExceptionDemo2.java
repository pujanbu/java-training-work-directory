package day19;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		ExceptionDemo2 obj = new ExceptionDemo2();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num:;");
		int a = input.nextInt();
		System.out.println("num 2::");
		int b = input.nextInt();

		try {
			double rs = obj.divide(a, b);
			System.out.println("ans::" + rs);
		} catch (ArithmeticException ae) {
			System.out.println("inside catch ");
		} catch (InputMismatchException ae) {
			System.out.println(ae);
		}

		System.out.println("exit ::");
	}

	public double divide(int a, int b) {
		return a / b;
	}
}

//try => block{}
//catch=> block{}
//finally => block{}
// throw=> statement
//throws=> clause