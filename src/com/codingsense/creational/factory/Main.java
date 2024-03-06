package com.codingsense.creational.factory;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = ShapeFactory.getShape("circle");
		Shape shape2 = ShapeFactory.getShape("rectangle");
		Shape shape3 = ShapeFactory.getShape("square");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
	

}
