package week1.examples.java_versions;

import java.util.Arrays;
import java.util.List;

record Employee(String name, int id, List<String> skills) {
	public Employee {
		if (id < 0) {
			throw new IllegalArgumentException("ID cannot be negative");
		}
	}

	public String displayInfo() {
		return "Employee Name: " + name + ", Skills: " + skills;
	}
}

public class RecordAdvancedExample {
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 123, Arrays.asList("Java", "Spring"));

		System.out.println(emp.displayInfo());
		System.out.println(emp); // toString 자동 생성
	}
}
