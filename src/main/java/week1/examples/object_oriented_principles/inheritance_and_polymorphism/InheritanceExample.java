package week1.examples.object_oriented_principles.inheritance_and_polymorphism;

class Animal {
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.sound();
		myCat.sound();
	}
}
