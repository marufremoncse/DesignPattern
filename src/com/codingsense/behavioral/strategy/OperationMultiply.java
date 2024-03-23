package com.codingsense.behavioral.strategy;

public class OperationMultiply implements Strategy {

	@Override
	public int doAction(int num1, int num2) {
		return num1 * num2;
	}

}
