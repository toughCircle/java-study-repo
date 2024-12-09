package week1.examples.final_and_static;

public class FinalVariableExample {
	public final int instanceVar = 42; // 변경 불가능 인스턴스 변수
	public static final double PI = 3.14159; // 상수 선언 (static 과 함께 사용)

	public static void main(String[] args) {
		FinalVariableExample example = new FinalVariableExample();
		// example.instanceVar = 50; // 컴파일 에러: final 변수 값 변경 불가
		System.out.println("Instance final variable: " + example.instanceVar);
		System.out.println("Static final constant: " + PI);
	}
}
