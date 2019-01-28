package com.infinite.code_to_interfaces;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void Draw() {

		System.out.println("Drawing a Circle");
		System.out.println("Center :(" + center.getX() + "," + center.getY() + ")");

	}

}
