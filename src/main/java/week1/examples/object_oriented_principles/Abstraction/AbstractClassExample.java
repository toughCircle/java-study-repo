package week1.examples.object_oriented_principles.Abstraction;

abstract class Vehicle {
	abstract void start();
	abstract void stop();

	public void info() {
		System.out.println("This is a vehicle");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car is starting...");
	}

	@Override
	void stop() {
		System.out.println("Car is stopping...");
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		Vehicle myCar = new Car();
		myCar.info();
		myCar.start();
		myCar.stop();
	}
}
