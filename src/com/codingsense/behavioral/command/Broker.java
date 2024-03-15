package com.codingsense.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	List<Order> orders = new ArrayList<Order>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void executeOrders() {
		for (Order order : orders) {
			order.execute();
		}
		orders.clear();
	}
}
