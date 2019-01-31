package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class TestMain {

	public static void main(String[] args) {
		
		/*String files[] = {"resources/car.xml","resources/engine.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(files);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/car.xml");
		
		Car car = (Car)context.getBean("carId");
		car.carDetails();
		
	}
}
