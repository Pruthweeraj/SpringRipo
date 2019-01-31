package com.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo {

	public static void main(String[] args) {
		
		
		/*Triangle triangle= new Triangle();
		triangle.draw();*/
		
		//creating instance by using XML BeanFactory
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		
	}
}
