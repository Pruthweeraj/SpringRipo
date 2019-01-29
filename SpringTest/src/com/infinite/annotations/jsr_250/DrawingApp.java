package com.infinite.annotations.jsr_250;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//CodeToInterFace
		String configLocation = "classpath:/com/infinite/annotations/jsr_250/springConfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		context.registerShutdownHook();
		
		//Drawing By using Interface
		//Shape shape = (Shape)context.getBean("triangle");
		//(or) 
		Shape shape = (Shape)context.getBean("circle");
		shape.Draw();
		
		System.out.println(context.getMessage("g", null, "Default Greeting", null));
		
		
	}
}
