package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Demo;


public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring2.xml");//here the object is created

		
		context.getBean("t");
		context.getBean("t");
		context.getBean("t");
		
	}
}
