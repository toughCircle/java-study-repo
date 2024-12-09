package week1.examples.final_and_static;

class StaticBlock {
	static int staticVar;

	static { // static 블록
		System.out.println("Static block executed.");
		staticVar = 100; // static 변수 초기화
	}

	public static void display() {
		System.out.println("Static Variable: " + staticVar);
	}
}

public class StaticBlockExample {
	public static void main(String[] args) {
		System.out.println("Main mathod started.");
		StaticBlock.display(); // static 블록은 한 번만 실행됨
	}
}
