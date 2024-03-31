package com.codingsense.behavioral.visitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerVisitor) {
		computerVisitor.visit(this);
	}

}
