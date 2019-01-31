package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.HelloWorldBean;

public class TestDemo {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloWorldBean obj =(HelloWorldBean)factory.getBean("helloObj");//here the HelloWorldBEan class object is created 
		HelloWorldBean obj2 =(HelloWorldBean)factory.getBean("helloObj");//same object 
		HelloWorldBean obj3 =(HelloWorldBean)factory.getBean("helloObj");//same object
		HelloWorldBean obj4 =(HelloWorldBean)factory.getBean("helloObj");//same object
		
		
		obj.Hello();
		System.out.println(obj==obj2);
		System.out.println(obj3==obj2);
		System.out.println(obj3==obj4);
		
	}
}
