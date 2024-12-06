package week1.examples.java_versions;

import java.util.stream.IntStream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		// 1 부터 1,000,000까지의 합 계산 (병렬 스트림 사용)
		long sum = IntStream.rangeClosed(1, 1_000_000)
			.parallel()
			.sum();

		System.out.println("합계: " + sum);
	}
}
