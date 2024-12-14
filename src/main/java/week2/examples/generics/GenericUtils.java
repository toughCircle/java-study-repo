package week2.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericUtils {

	// 다양한 타입의 리스트를 결합하는 메서드
	// merge 메서드는 타입 파라미터 T를 활용하여 서로 다른 리스트를 합치는 유틸리티 메서드로 재사용성 극대화.
	public static <T> List<T> merge(List<T> list1, List<T> list2) {
		List<T> merged = new ArrayList<>(list1);
		merged.addAll(list2);
		return merged;
	}

	// 와일드카드를 활용한 상위 타입 리스트 출력
	// printAll 메서드는 모든 타입의 리스트를 받아 출력할 수 있으나, 리스트에 값을 넣을 순 없다(?는 무엇인지 불명확하기 때문에).
	public static void printAll(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

	// Number 상속 타입만 평균 계산
	// average 메서드는 Number를 상속한 타입들에만 적용 가능하도록 ? extends Number 사용.
	public static double average(List<? extends Number> numbers) {
		double sum = 0;
		for(Number num : numbers) {
			sum += num.doubleValue();
		}
		return sum / numbers.size();
	}

}
