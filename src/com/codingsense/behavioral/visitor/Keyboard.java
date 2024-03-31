package com.codingsense.behavioral.visitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerVisitor) {
		computerVisitor.visit(this);
	}

}
