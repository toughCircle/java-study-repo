package week1.examples.java_versions;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// 람다 표현식으로 출력
		names.forEach(name -> System.out.println(name));
		// 동일 코드
		// names.forEach(System.out::println);
	}
}
