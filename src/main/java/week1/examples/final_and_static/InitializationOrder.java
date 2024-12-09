package week1.examples.final_and_static;

class InitializationOrder {
	static int staticVar;
	int instanceVar;

	static {
		System.out.println("Static block executed.");
		staticVar = 42;
	}

	{
		System.out.println("Instance block executed.");
		instanceVar = 24;
	}

	public InitializationOrder() {
		System.out.println("Constructor executed.");
	}

	public static void main(String[] args) {
		System.out.println("Main method started.");
		InitializationOrder obj1 = new InitializationOrder();
		InitializationOrder obj2 = new InitializationOrder();
	}
}
