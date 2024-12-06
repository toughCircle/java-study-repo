package week1.examples.object_oriented_principles.encapsulation;

public class AccessModifiersExample {
	private String privateField = "Private Field";
	protected String protectedField = "Protected Field";
	public String publicField = "Public Field";
	String defaultField = "Default Field";

	public static void main(String[] args) {
		AccessModifiersExample example = new AccessModifiersExample();

		System.out.println(example.privateField);
		System.out.println(example.protectedField);
		System.out.println(example.publicField);
		System.out.println(example.defaultField);
	}
}
