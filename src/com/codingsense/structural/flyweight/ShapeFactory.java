package com.codingsense.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	public static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();

	public static Circle getCircle(String color) {
		if (circleMap.containsKey(color)) {
			return circleMap.get(color);
		}
		Circle circle = new Circle(color);
		circleMap.put(color, circle);
		return circle;
	}
}
