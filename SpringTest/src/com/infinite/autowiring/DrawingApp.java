package com.infinite.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//Object Injection
		//String configLocation = "spring.xml";
		
		//InnerBean ,alias , idref
		//String configLocation = "spring2.xml";
		
		//AutoWiring
		String configLocation = "springAutowire.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
													//triangle-name (or) triangle-alias 
		Triangle triangle = (Triangle)context.getBean("triangle");//we can call by beanName and beanAlias also
		triangle.Draw();
	}
}
