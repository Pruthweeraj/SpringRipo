package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BeanTest;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");//here the object is created in case of SINGLETON
	
		BeanTest obj = (BeanTest)context.getBean("pr");
		obj.run();
		BeanTest ob2 = (BeanTest)context.getBean("pr");
		obj.run();
	
	}
}
