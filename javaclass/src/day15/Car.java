package day15;

public class Car {

	private Engine engine;

	public Car() {
		engine = new Engine();
	}

	public void start() {
		engine.move();
		System.out.println("car started");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
	}
}
