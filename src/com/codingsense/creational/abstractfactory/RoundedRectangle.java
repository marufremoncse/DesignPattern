package com.codingsense.creational.abstractfactory;

import com.codingsense.creational.factory.Shape;

public class RoundedRectangle implements Shape {

	public void draw() {
		System.out.println("Draw method from :: RoundedRectangle");
	}
}
