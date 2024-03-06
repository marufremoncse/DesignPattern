package com.codingsense.creational.abstractfactory;

import com.codingsense.creational.factory.Shape;

public class RoundedShapeFactory implements AbstractFactory {

	public Shape getShape(String arg) {
		if (arg == null) {
			return null;
		} else if (arg.equalsIgnoreCase("rectangle")) {
			return new RoundedRectangle();
		} else if (arg.equalsIgnoreCase("square")) {
			return new RoundedSquare();
		}
		return null;
	}

}
