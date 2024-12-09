package week1.examples.object_oriented_principles.inheritance_and_polymorphism;

class Calculator {
	// Overloading
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// Overloading demonstration
		System.out.println("Integer addition: " + calculator.add(2, 3));
		System.out.println("Double addition: " + calculator.add(2.5, 3.5));
	}

}
