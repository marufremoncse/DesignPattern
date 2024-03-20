package com.codingsense.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		subject.setState(10);
		subject.setState(25);
		subject.setState(45);
	}

}
