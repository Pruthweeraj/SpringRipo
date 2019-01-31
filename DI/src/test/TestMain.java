package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Resources/spring.xml");
		Test test = (Test)context.getBean("pr");
		String name = "pruthwee";
		test.details(name);
	}
}
