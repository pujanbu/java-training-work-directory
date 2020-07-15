package day4;

public class OperatorDemo1 {
	public static void main(String[] args) {
		//1.Arithmetic Operator + - * / %
		// Precedence + - low || * / high
		//Associativity left to right
		
		int a = 4+5 -4 /2 +3 *4 -7 % 3;
		System.out.println(a);
		
		
		//2. Assignment operators = +=  -=  /= *= %= 
		//associativity right to left 
		
		int i=4;
		System.out.println(i);
		
		i+=2;
		System.out.println(i);
	}

}
