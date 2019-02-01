package beans;

public class Car {

	private String carName;
	private Engine engine;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printDetails() {
		System.out.println("CarName:" + carName + "\nEngine:" + engine.getModelYear());

	}
}
