package week2.examples.string;

public class StringExample {
	public static void main(String[] args) {
		// String - 불변
		String str = "Hello";
		str = str + " World"; // 새로운 String 객체 생성
		System.out.println("String: " + str);

		// StringBuilder - 가변, 동기화 X
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World"); // 기존 객체 수정
		System.out.println("StringBuilder: " + sb.toString());

		// StringBuffer - 가변, 동기화 O
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" World");
		System.out.println("StringBuffer: " + sbf.toString());
	}
}
