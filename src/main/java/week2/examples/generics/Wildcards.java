package week2.examples.generics;

import java.util.List;

public class Wildcards {

	// List<Integer>, List<Double> 등 Number를 상속하는 타입 리스트를 인자로 받을 수 있다.
	public static void printNumber(List<? extends Number> list) {
		for (Number num : list) {
			System.out.println(num);
		}
	}

	// List<Object>나 List<Number> 등 Integer 이상의 상위 클래스 타입을 가진 리스트에 안전하게 Integer 값을 넣을 수 있다.
	public static void addNumbers(List<? super Integer> list) {
		list.add(1);
		list.add(2);
	}

}
