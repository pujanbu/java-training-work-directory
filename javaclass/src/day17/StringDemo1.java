package day17;

public class StringDemo1 {
	public static void main(String[] args) {

		// implicit creation
		String s1 = "Pujan Budhathoki";
		System.out.println(s1);

		// explicit creation (by calling constructor);
		String s2 = new String();
		System.out.println(s2);

		String s3 = new String("Hello World");
		System.out.println(s3);

		char[] ch = { 'a', 'b', 'c' };
		String s4 = new String(ch);
		System.out.println(s4);
		
		byte[] bb= {65,66,67};
		String s5=new String(bb);
		System.out.println(s5);
	}
}
