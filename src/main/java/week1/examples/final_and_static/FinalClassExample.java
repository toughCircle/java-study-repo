package week1.examples.final_and_static;

final class FinalClass {
	public void display() {
		System.out.println("This is a final class.");
	}
}

// class SubClass extends FinalClass {
	// 컴파일 에러: final 클래스 상속 불가
// }

public class FinalClassExample {
	public static void main(String[] args) {
		FinalClass finalClass = new FinalClass();
		finalClass.display();
	}
}
