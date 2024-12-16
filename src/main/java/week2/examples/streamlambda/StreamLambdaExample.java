package week2.examples.streamlambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamLambdaExample {

	public static void main(String[] args) {

		// 람다 표현식 사용 Comparator 구현
		Comparator<String> lengthComparator = (s1, s2) -> s1.length() - s2.length();

		// 함수형 인터페이스(Predicate) 활용
		Predicate<Integer> isEven = n -> n % 2 == 0;

		// 스트림 API
		List<String> words = Arrays.asList("java", "lambda", "stream", "parallel", "collector");
		List<String> result = words.stream()
			.filter(w -> w.length() > 5)    // 중간 연산
			.map(String::toUpperCase)    // 중간 연산
			.sorted(lengthComparator.reversed())    // 중간 연산
			.toList();    // 최종 연산

		System.out.println(result);

		// Predicate 스트림에서 응용
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		long evenCount = numbers.stream()
			.filter(isEven)  // 람다 대신 isEven 사용
			.count();        // 최종 연산

		System.out.println("짝수 개수: " + evenCount);
	}
}
