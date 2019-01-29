package com.infinite.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing a Circle");
		System.out.println("Center :(" + center.getX() + "," + center.getY() + ")");

	}

}
