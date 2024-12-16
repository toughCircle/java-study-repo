package week2.examples.annotation;

@MyAnnotation(value = "Custom Annotation Example", version = 2)
public class AnnotatedClass {

	@Deprecated()
	public void deprecatedMethod() {
		System.out.println("더 이상 사용되지 않는 메서드입니다.");
	}

	@Override
	public String toString() {
		return "AnnotatedClass toString()";
	}
}
