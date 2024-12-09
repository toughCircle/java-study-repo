package week1.examples.final_and_static;

class Parent {
	public final void displayMessage() {
		System.out.println("This is a final method");
	}
}

class Child extends Parent {
	// @Override
	// public void displayMessage() {
		// 컴파일 에러: final 메서드 오버라이딩 불가
	// }
}

public class FinalMethodExample {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.displayMessage();
	}
}
