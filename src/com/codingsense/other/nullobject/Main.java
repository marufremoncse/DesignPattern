package com.codingsense.other.nullobject;

public class Main {

	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Remon");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Alex");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Anni");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Zurich");

		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
