package com.codingsense.creational.abstractfactory;

import com.codingsense.creational.factory.Shape;

public interface AbstractFactory {
	Shape getShape(String arg);
}
