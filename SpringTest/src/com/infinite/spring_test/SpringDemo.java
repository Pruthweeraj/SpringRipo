package com.infinite.spring_test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class SpringDemo {

public static void main(String[] args) {
		
		
		/*Triangle triangle= new Triangle();
		triangle.draw();*/
		
		//creating instance by using XML BeanFactory
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springconfig.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();*/
	
	//creating instance by using ApplicationContext
	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	Triangle triangle = (Triangle)context.getBean("triangle-alias");
	triangle.draw();
		
	
	}
	
}
