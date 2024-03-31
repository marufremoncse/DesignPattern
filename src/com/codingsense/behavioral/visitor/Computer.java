package com.codingsense.behavioral.visitor;

public class Computer implements ComputerPart {
	ComputerPart[] computerParts = { new Mouse(), new Keyboard(), new Monitor() };

	@Override
	public void accept(ComputerPartVisitor computerVisitor) {
		for (ComputerPart c : computerParts) {
			c.accept(computerVisitor);
		}
		computerVisitor.visit(this);
	}

}
