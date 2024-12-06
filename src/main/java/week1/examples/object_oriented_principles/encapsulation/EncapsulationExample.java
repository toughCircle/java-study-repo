package week1.examples.object_oriented_principles.encapsulation;

class Person {
	private String name;
	private int age;

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Getter
	public int getAge() {
		return age;
	}

	// Setter
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age must be positive!");
		}
	}
}

// getter와 setter를 통한 데이터 접근
public class EncapsulationExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Alice");
		person.setAge(25);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}