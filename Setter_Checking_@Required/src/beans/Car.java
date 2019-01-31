package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carName;
	private Engine engine;

	@Required
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getCarName() {
		return carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void PrintCar(){
		System.out.println("Car Name:-"+carName+"\nModel Year:"+engine.getModelYear() );
	}
}
