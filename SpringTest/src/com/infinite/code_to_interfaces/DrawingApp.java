package com.infinite.code_to_interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//CodeToInterFace
		String configLocation = "springCodeToInterface.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		/*
		//Drawing by using BeanClasses referenceses 
		//for Drawing a Triangle
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.Draw();
		
		//for Drawing a circle
		Circle circle = (Circle)context.getBean("circle");
		circle.Draw();
		
		*/
		
		//Drawing By using Interface
		Shape shape = (Shape)context.getBean("triangle");
		//(or) 
		//Shape shape = (Shape)context.getBean("circle");
		shape.Draw();
		
		
		
		
	}
}
