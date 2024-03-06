package com.codingsense.creational.abstractfactory;

import com.codingsense.creational.factory.Rectangle;
import com.codingsense.creational.factory.Shape;
import com.codingsense.creational.factory.Square;

public class ShapeFactory implements AbstractFactory{
	public Shape getShape(String arg) {
		if(arg==null) {
			return null;
		} else if(arg.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if(arg.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
