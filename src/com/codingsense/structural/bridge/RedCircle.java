package com.codingsense.structural.bridge;

public class RedCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Red circle. Radius: " + radius + " x: " + x + " y: " + y);
	}
}
