package com.codingsense.creational.prototype;

public class Car extends Vehicle implements Cloneable {

	@Override
	public String type() {
		return "Car";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
