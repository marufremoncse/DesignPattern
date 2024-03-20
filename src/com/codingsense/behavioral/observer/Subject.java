package com.codingsense.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer o) {
		observers.add(o);
	}

	private void notifyAllObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}

}
