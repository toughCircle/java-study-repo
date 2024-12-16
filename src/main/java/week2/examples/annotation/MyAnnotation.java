package week2.examples.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 어노테이션의 적용 범위와 유지 정책 지정
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "";
	int version() default 1;
}
