package com.codingsense.creational.builder;

public class MealBuilder {
	 Meal meal;

	public Meal vegMeal() {
		this.meal = new Meal();
		Burger vegBurger = new VegBurger();
		SoftDrink softDrink = new Mojo();
		meal.addItem(vegBurger);
		meal.addItem(softDrink);
		return this.meal;
	}

	public Meal nonVegMeal() {
		this.meal = new Meal();
		Burger chickenBurger = new ChikenBurger();
		SoftDrink softDrink = new Clemon();
		meal.addItem(chickenBurger);
		meal.addItem(softDrink);
		return this.meal;
	}
}
