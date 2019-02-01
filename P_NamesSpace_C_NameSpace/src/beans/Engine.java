package beans;

public class Engine {

	private String modelYear;

	private Engine(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getModelYear() {
		return modelYear;
	}
}
