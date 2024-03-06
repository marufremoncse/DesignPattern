package com.codingsense.creational.builder;

public abstract class SoftDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
}
