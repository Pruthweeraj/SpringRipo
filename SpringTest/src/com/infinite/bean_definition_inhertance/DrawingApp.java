package com.infinite.bean_definition_inhertance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		
		String configLocation = "springBeanDefinitionInheritance.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		Triangle triangle1 = (Triangle)context.getBean("triangle1");
		triangle1.Draw();
		Triangle triangle2 = (Triangle)context.getBean("triangle2");
		triangle2.Draw();
	}
}
