package week1.examples.final_and_static;

class StaticVariable {
	public static int sharedCounter = 0;

	// 객체가 생성될 때마다 정적 변수 증가
	public StaticVariable() {
		sharedCounter++;
	}

	public static void displayCounter() {
		System.out.println("Shared Counter: " + sharedCounter);
	}
}

public class StaticVariableExample {
	public static void main(String[] args) {
		new StaticVariable();
		new StaticVariable();
		StaticVariable.displayCounter();
	}
}