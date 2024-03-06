package com.codingsense.creational.prototype;

public class Motorbike extends Vehicle {

	public Motorbike() {
		type = "Motorbike";
	}

	@Override
	public void start() {
		System.out.println("Start method from :: Car");
	}
}
