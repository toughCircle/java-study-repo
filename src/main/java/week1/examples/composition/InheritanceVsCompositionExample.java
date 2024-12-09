package week1.examples.composition;

// 상속
class Parent {
	public void show() {
		System.out.println("This is a parent class method.");
	}
}

class Child extends Parent {
	@Override
	public void show() {
		System.out.println("This is a child class method.");
	}
}

// 조합
class Component {
	public void display() {
		System.out.println("This is a component method.");
	}
}

class Composite {
	private Component component;

	public Composite(Component component) {
		this.component = component;
	}

	public void useComponent() {
		component.display();
	}
}

public class InheritanceVsCompositionExample {
	public static void main(String[] args) {
		// 상속
		Parent parent = new Child();
		parent.show(); // 다형성 활용

		// 조합
		Component component = new Component();
		Composite composite = new Composite(component);
		composite.useComponent();
	}
}
