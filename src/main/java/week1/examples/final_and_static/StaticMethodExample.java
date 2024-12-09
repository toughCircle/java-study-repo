package week1.examples.final_and_static;

class Utility {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class StaticMethodExample {
	public static void main(String[] args) {
		int result = Utility.add(5, 10); // 객체 생성 없이 호출
		System.out.println("Sum: " + result);
	}
}
