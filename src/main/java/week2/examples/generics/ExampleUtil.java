package week2.examples.generics;

public class ExampleUtil {
	public static <T> T pickFirst(T a, T b) {
		return a != null ? a : b;
	}
}

// 사용 예시
// String first = ExampleUtil.pickFirst("Hello", "World");
// Integer number = ExampleUtil.pickFirst(10, 20);
