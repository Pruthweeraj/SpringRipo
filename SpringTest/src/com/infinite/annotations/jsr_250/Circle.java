package com.infinite.annotations.jsr_250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/*
@Service//telling spring this bean is a service
@Repository//telling spring this bean is a Repository
@Controller//telling spring this bean is a Controller

*/
@Component//telling spring this is a 'bean' means Component
public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name="point2")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing a Circle");
		System.out.println("Center :(" + center.getX() + "," + center.getY() + ")");

	}
	
	@PostConstruct
	public void InitilizeCircle(){
		System.out.println("Init of Circle_Bean");
	}

	@PreDestroy
	public void DestroyCercle(){
		System.out.println("Destroy of Circle_Bean");
	}
}
