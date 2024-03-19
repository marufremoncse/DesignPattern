package com.codingsense.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	List<Memento> listMementos = new ArrayList<Memento>();

	public void add(Memento memento) {
		listMementos.add(memento);
	}

	public Memento get(int index) {
		return listMementos.get(index);
	}
}
