package week2.examples.generics;

public class Box<T> {
	private T content;

	public Box(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}

// 클래스 인스턴스 생성 시 구체적인 타입 지정
// Box<String> stringBox = new Box<>("Hello");
