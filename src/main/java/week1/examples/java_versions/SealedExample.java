package week1.examples.java_versions;

import java.awt.*;

sealed class Shape permits Circle, Rectangle {}

final class Circle extends Shape {}

final class Rectangle extends Shape {}

public class SealedExample {
	public static void main(String[] args) {
		Shape shape = new Circle();
		System.out.println("Shape is a: " + shape.getClass().getSimpleName());
	}
}
