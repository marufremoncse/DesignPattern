package com.codingsense.behavioral.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerVisitor);
}
