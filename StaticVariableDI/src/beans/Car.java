package beans;

public class Car {

	private static String carName;
	
	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	public static String getCarName() {
		return carName;
	}
	
	public static void carDetails(){
		System.out.println("CarName:"+carName);
	}
}
