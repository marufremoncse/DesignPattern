package com.codingsense.structural.proxy;

public class ProxyImage implements Image {
	RealImage realImage;
	private String filename;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(filename);
		}
		realImage.display();
	}

}
