package com.infinite.bean_post_processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		String configLocation = "springBeanPostProcessor.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.Draw();
	}
}
