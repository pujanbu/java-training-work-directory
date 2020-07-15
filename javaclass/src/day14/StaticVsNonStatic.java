package day14;

public class StaticVsNonStatic {
	String name;
	int age;

	public void display() {
		System.out.println(name + " " + age);
	}

	public static void display2() {
		StaticVsNonStatic stat = new StaticVsNonStatic();
		System.out.println(stat.name + " " + stat.age);
	}

	public static void main(String[] args) {
		StaticVsNonStatic stat = new StaticVsNonStatic();
		stat.name = "Pujan";
		stat.age = 23;
		stat.display();
		stat.display2();
	}
}
