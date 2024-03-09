package com.codingsense.structural.decorator;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();

		ShapeDecorator shapeDecorator1 = new RedShapeDecorator(new Circle());
		shapeDecorator1.draw();

		ShapeDecorator shapeDecorator2 = new RedShapeDecorator(new Rectangle());
		shapeDecorator2.draw();
	}
}
