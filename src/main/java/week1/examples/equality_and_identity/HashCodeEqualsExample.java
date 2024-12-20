package week1.examples.equality_and_identity;

import java.util.Objects;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age && Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}

public class HashCodeEqualsExample {
	public static void main(String[] args) {
		Person p1 = new Person("Alice", 30);
		Person p2 = new Person("Alice", 30);

		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() == p2.hashCode());
	}
}
