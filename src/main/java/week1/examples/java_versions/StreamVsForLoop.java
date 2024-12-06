package week1.examples.java_versions;

import java.util.ArrayList;
import java.util.List;

public class StreamVsForLoop {
	public static void main(String[] args) {
		// 1억 개의 숫자를 가진 리스트 생성
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 100_000_000; i++) {
			numbers.add(i);
		}

		// 일반 for문 실행 시간 측정
		long start = System.currentTimeMillis();
		long sumForLoop = 0;
		for (int num : numbers) {
			sumForLoop += num;
		}
		long end = System.currentTimeMillis();
		System.out.println("일반 for문 실행 시간: " + (end - start) + "ms");

		// 스트림 실행 시간 측정
		start = System.currentTimeMillis();
		long sumStream = numbers.stream()
			.mapToLong(Integer::longValue)
			.sum();
		end = System.currentTimeMillis();
		System.out.println("스트림 실행 시간: " + (end - start) + "ms");

		// 병렬 스트림 실행 시간 측정
		start = System.currentTimeMillis();
		long sumParallelStream = numbers.parallelStream()
			.mapToLong(Integer::longValue)
			.sum();
		end = System.currentTimeMillis();
		System.out.println("병렬 스트림 실행 시간: " + (end - start) + "ms");
	}
}
