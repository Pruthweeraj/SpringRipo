package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Resources/spring.xml");
		
		Car c=(Car)context.getBean("car");
		
		c.carDetails();
		Car.carDetails();
		
		
	}
}
