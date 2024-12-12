package week2.examples.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
			System.out.println("result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("계산 시도 종료");
		}
	}

	private static int divide(int a, int b) {
		return a / b;
	}
}
