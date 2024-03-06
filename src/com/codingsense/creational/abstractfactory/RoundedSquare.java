package com.codingsense.creational.abstractfactory;

import com.codingsense.creational.factory.Shape;

public class RoundedSquare implements Shape{
	@Override
	public void draw() {
		System.out.println("Draw method from :: RoundedSquare");
	}
}
