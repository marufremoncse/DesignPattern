package com.codingsense.creational.prototype;

public class Car extends Vehicle {

	public Car() {
		type = "Car";
	}

	@Override
	public void start() {
		System.out.println("Start method from :: Car");
	}

}
