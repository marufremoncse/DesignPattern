package com.codingsense.creational.builder;

public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Vegetable Burger";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
