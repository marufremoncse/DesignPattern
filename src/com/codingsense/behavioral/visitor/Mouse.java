package com.codingsense.behavioral.visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerVisitor) {
		computerVisitor.visit(this);
	}

}
