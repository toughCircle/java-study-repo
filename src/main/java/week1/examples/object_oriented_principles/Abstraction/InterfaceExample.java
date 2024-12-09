package week1.examples.object_oriented_principles.Abstraction;

interface Flyable {
	void takeOff();
	void land();
}

class Airplane implements Flyable {
	@Override
	public void takeOff() {
		System.out.println("Airplane is taking off...");
	}

	@Override
	public void land() {
		System.out.println("Airplane is landing...");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Flyable airplane = new Airplane();
		airplane.takeOff();
		airplane.land();
	}
}
