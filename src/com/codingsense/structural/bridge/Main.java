package com.codingsense.structural.bridge;

public class Main {

	public static void main(String[] args) {
		DrawAPI greenCircle = new GreenCircle();
		Shape shape1 = new Circle(10, 6, 4, greenCircle);
		shape1.draw();

		DrawAPI redCircle = new RedCircle();
		Shape shape2 = new Circle(15, 7, 3, redCircle);
		shape2.draw();
	}

}
