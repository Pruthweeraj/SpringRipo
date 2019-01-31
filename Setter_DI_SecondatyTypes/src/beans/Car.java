package beans;

public class Car {

	private Engine engine;
	private String carName;

	
	public Car() {
		System.out.println("Car Constructor..");
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void carDetails(){
		System.out.println("Car Name:"+ carName+" \n Model Year:"+engine.getModelYear());
	}
}
