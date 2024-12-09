package week1.examples.composition;

class Engine {
	public void start() {
		System.out.println("Engine is starting...");
	}

	public void stop() {
		System.out.println("Engine is stopping...");
	}
}

class Car {
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void startCar() {
		System.out.println("Car is starting...");
		engine.start();
	}

	public void stopCar() {
		System.out.println("Car is stopping...");
		engine.stop();
	}
}

public class CompositionExample {
	public static void main(String[] args) {
		Engine engine = new Engine();
		Car car = new Car(engine);

		// 조합된 엔진 객체 사용
		car.startCar();
		car.stopCar();
	}
}
