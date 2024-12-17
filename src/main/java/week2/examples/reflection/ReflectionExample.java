package week2.examples.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) {

		try {
			// 1. 클래스 정보 가져오기
			Class<?> clazz = Class.forName("week2.examples.annotation.AnnotatedClass");

			// 2. 클래스에 적용된 어노테이션 조회
			Annotation[] classAnnotations = clazz.getAnnotations();
			for (Annotation annotation : classAnnotations) {
				System.out.println("class annotation: " + annotation);
			}

			// 3. 메서드 정보와 어노테이션 조회
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("method name: " + method.getName());
				Annotation[] annotations = method.getAnnotations();
				for (Annotation annotation : annotations) {
					System.out.println(" -> method annotation: " + annotation);
				}
			}

			// 4. 메서드 호출
			Object instance = clazz.getDeclaredConstructor().newInstance();
			for (Method method : methods) {
				// deprecatedMethod 이름의 메서드만 호출
				if (method.getName().equals("deprecatedMethod")) {
					method.invoke(instance);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
