package com.codingsense.structural.proxy;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("Anni.jpg");

		// loaded from disk
		image.display();

		// not loaded from disk
		image.display();
	}

}
