package week1.examples.equality_and_identity;

public class EqualityExample {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
	}
}
