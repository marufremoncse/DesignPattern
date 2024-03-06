package com.codingsense.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void getCost() {
		System.out.println(items.stream().map(item -> item.price()).reduce(0.0f, Float::sum));
	}

	public void showItems() {
		items.forEach(item -> {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		});
	}
}
