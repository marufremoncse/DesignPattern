package com.codingsense.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		drawRedBorder();
	}

	public void drawRedBorder() {
		System.out.println("Red Border added");
	}

}
