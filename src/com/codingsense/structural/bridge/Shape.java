package com.codingsense.structural.bridge;

public abstract class Shape {
	DrawAPI drawAPI;

	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
