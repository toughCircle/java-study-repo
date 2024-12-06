package week1.examples.java_versions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// 스트림을 사용해 각 숫자에 2를 곱하고 출력
		numbers.stream()
			.map(n -> n * 2) // 각 요소를 변환
			.forEach(System.out::println); // 변환된 값을 모두 출력
	}

	// 스트림 필터링, 정렬
	public static class StreamFilterSort {
		public static void main(String[] args) {
			List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Cade");

			// 이름 중 'C'로 시작하는 이름을 필터링하고 정렬
			names.stream()
				.filter(name -> name.startsWith("C")) // 필터링
				.sorted() // 알파벳 순으로 정렬
				.forEach(System.out::println);
		}
	}

	// 스트림 그룹화
	public static class StreamGrouping {
		public static void main(String[] args) {
			List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

			// 이름 첫 글자 기준으로 그룹화
			Map<Character, List<String>> groupedByFirstLetter = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));

			groupedByFirstLetter.forEach((key, value) -> System.out.println(key + ":" + value));
		}
	}

	// 스트림 연산
	public static class StreamStatistics {
		public static void main(String[] args) {
			List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

			// 합계
			int sum = numbers.stream()
				.mapToInt(Integer::intValue) // int 스트림 변환
				.sum();

			// 평균
			OptionalDouble average = numbers.stream()
				.mapToInt(Integer::intValue)
				.average();
		}
	}
}