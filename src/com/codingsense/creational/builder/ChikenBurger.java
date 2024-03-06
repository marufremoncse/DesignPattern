package com.codingsense.creational.builder;

public class ChikenBurger extends Burger {

	@Override
	public String name() {
		return "Chiken Burger";
	}

	@Override
	public float price() {
		return 40.0f;
	}

}
