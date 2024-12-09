package week1.examples.object_oriented_principles.Abstraction;

// Abstract class
abstract class Shape {
	abstract void draw(); // 추상 메서드
	void info() { // 일반 메서드
		System.out.println("This is a Shape.");
	}
}

// Interface class
interface Colorable {
	void color(); // 추상 메서드
}

// A class implementing both
class Circle extends Shape implements Colorable {
	@Override
	public void color() {
		System.out.println("Coloring the circle...");
	}

	@Override
	void draw() {
		System.out.println("Drawing a circle...");
	}
}

public class AbstractVsInterfaceExample {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.info();
		circle.draw();
		circle.color();
	}
}
