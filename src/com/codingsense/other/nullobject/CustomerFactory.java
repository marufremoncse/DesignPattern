package com.codingsense.other.nullobject;

public class CustomerFactory {
	private final static String[] names = { "Remon", "Tomon", "Tonu", "Maryam", "Anni" };

	public static AbstractCustomer getCustomer(String customerName) {
		for (String name : names) {
			if (customerName.equalsIgnoreCase(name)) {
				return new RealCustomer(customerName);
			}
		}
		return new NullCustomer();
	}
}
