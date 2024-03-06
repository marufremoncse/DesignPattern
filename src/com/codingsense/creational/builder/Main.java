package com.codingsense.creational.builder;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		System.out.println("Non Veg Meal");
		Meal meal1 = mealBuilder.nonVegMeal();
		meal1.showItems();
		meal1.getCost();
		
		System.out.println("\n\nVeg Meal");
		Meal meal2 = mealBuilder.vegMeal();
		meal2.showItems();
		meal2.getCost();
	}

}
