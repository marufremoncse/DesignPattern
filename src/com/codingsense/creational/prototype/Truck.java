package com.codingsense.creational.prototype;

public class Truck extends Vehicle {

	public Truck() {
		type = "Truck";
	}

	@Override
	public void start() {
		System.out.println("Start method from :: Car");
	}
}
