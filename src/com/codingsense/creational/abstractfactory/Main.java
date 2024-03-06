package com.codingsense.creational.abstractfactory;

import com.codingsense.creational.factory.Shape;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory1 = FactoryProducer.getFactory(false);
		
		Shape shape1 = factory1.getShape("rectangle");
		Shape shape2 = factory1.getShape("square");
		
		AbstractFactory factory2 = FactoryProducer.getFactory(true);
		Shape shape3 = factory2.getShape("rectangle");
		Shape shape4 = factory2.getShape("square");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		shape4.draw();
	}

}
