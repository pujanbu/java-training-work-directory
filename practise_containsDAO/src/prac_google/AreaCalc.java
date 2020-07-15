package prac_google;

import java.util.Scanner;

public class AreaCalc {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your choice of polygon:");
		System.out.println("Circle | Rectangle | Triangle");
		String choice=input.nextLine();
		choice=choice.toLowerCase();
		
		if (choice.equals("triangle")) {
			System.out.println("Choice selected Triangle");
			System.out.println("Please Enter the height of the Triangle");
			float height=input.nextFloat();
			System.out.println("Please Enter the base of the Triangle");
			float base=input.nextFloat();
			float Area = height*base/2;
			System.out.println("The area is "+Area);
			
			
		}
		else if (choice.equals("rectangle")) {
			System.out.println("Choice selected Rectangle");
			System.out.println("Please Enter the length of the Rectangle");
			float height=input.nextFloat();
			System.out.println("Please Enter the breadth of the Rectangle");
			float base=input.nextFloat();
			float Area = height * base;
			System.out.println("The area is "+Area);
		}
		else if (choice.equals("circle"))
		{
			System.out.println("Choice selected Circle");
			System.out.println("Please Enter the radius of the Circle");
			double radius=input.nextDouble();
			double Area = (Math.PI*Math.pow(radius, 2));
			System.out.println("The area is "+Area);
		}
		else {
			System.out.println("invalid choice");
		}
	
}
}
