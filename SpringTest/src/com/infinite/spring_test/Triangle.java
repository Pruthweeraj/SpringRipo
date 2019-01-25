package com.infinite.spring_test;

public class Triangle {

	private String type;
	private int hight;
	
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int hight) {
		this.hight = hight;
	}
	
	

	public Triangle(String type, int hight) {
		super();
		this.type = type;
		this.hight = hight;
	}
	
	public Triangle(int hight , String type) {
		super();
		this.type = type;
		this.hight = hight;
	}

	public void draw() {
		System.out.println(getType() + "-Triangle Drawn and Highy is: " + getHight());
	}

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public int getHight() {
		return hight;
	}

	/*public void setHight(int hight) {
		this.hight = hight;
	}*/

}
