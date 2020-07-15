package prac_google;

import java.util.Scanner;

public class PeriCalc {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your choice of polygon:");
		System.out.println("Circle | Rectangle | Triangle");
		String choice=input.nextLine();
		choice=choice.toLowerCase();
		
		if (choice.equals("triangle")) {
			System.out.println("Choice selected Triangle");
			System.out.println("Please Enter the 1st side of the Triangle");
			float first=input.nextFloat();
			System.out.println("Please Enter the 2nd side of the Triangle");
			float second=input.nextFloat();
			System.out.println("Please Enter the 3rd side of the Triangle");
			float third=input.nextFloat();
			float Peri = first+second+third;
			System.out.println("The Perimeter is "+Peri);
			
			
		}
		else if (choice.equals("rectangle")) {
			System.out.println("Choice selected Triangle");
			System.out.println("Please Enter the 1st side of the Triangle");
			float first=input.nextFloat();
			System.out.println("Please Enter the 2nd side of the Triangle");
			float second=input.nextFloat();
			
			float Peri = 2*(first+second);
			System.out.println("The Perimeter is "+Peri);
			}
		else if (choice.equals("circle"))
		{
			System.out.println("Choice selected Circle");
			System.out.println("Please Enter the radius of the Circle");
			double radius=input.nextDouble();
			double Peri = (Math.PI*radius*2);
			System.out.println("The perimeter is "+Peri);
		}
		else {
			System.out.println("invalid choice");
		}
	
}

}
