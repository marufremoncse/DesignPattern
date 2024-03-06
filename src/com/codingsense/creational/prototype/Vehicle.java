package com.codingsense.creational.prototype;

public abstract class Vehicle implements Cloneable {
	private String id;
	protected String type;

	public abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
