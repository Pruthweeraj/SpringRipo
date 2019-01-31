package beans;

public class Car {

	private String carName[];
	private Engine engine[];

	public void setCarName(String[] carName) {
		this.carName = carName;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public String[] getCarName() {
		return carName;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void PrintCar(){
		for(String carName1 : carName){
			System.out.println(carName1);
		}
		for(Engine engine1 : engine){
			System.out.println(engine1.getModelYear());
		}
		
	}
}
