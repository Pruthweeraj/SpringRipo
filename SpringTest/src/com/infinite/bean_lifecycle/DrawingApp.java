package com.infinite.bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		String configLocation = "springLifecycle.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		context.registerShutdownHook();
	
		Triangle triangle = (Triangle)context.getBean("triangle");//we can call by beanName and beanAlias also
		triangle.Draw();
	}
}
