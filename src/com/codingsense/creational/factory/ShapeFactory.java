package com.codingsense.creational.factory;

public class ShapeFactory {
	public static Shape getShape(String arg) {
		if(arg==null) {
			return null;
		} else if(arg.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if(arg.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if(arg.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
