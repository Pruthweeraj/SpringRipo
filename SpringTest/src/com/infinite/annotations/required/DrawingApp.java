package com.infinite.annotations.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//CodeToInterFace
		String configLocation = "classpath:/com/infinite/annotations/required/springRequired.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
	
		
		//Drawing By using Interface
		//Shape shape = (Shape)context.getBean("triangle");
		//(or) 
		Shape shape = (Shape)context.getBean("circle");
		shape.Draw();
		
		
		
		
	}
}
