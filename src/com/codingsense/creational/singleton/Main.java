package com.codingsense.creational.singleton;

public class Main {

	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getObject();
		singleObject.printHello();
		
		SingleObject singleObject2 = SingleObject.getObject();
		singleObject2.printHello();
		
		System.out.println(singleObject.hashCode());
		System.out.println(singleObject2.hashCode());

	}

}
