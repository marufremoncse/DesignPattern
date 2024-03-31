package com.codingsense.behavioral.visitor;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
		computer.accept(computerPartVisitor);
	}

}
