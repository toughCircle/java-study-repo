package week2.examples.exception;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String massage) {
		super(massage);
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println("유효하지 않은 나이: " + e.getMessage());
		}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("18세 미만은 접근할 수 없습니다.");
		}
		System.out.println("나이 검증 완료");
	}
}
