package com.codingsense.behavioral.command;

public class Main {
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		Order buyStock = new BuyStock(abcStock);
		Order sellStock = new SellStock(abcStock);

		Broker broker = new Broker();

		broker.addOrder(buyStock);
		broker.addOrder(sellStock);

		broker.executeOrders();
	}
}
