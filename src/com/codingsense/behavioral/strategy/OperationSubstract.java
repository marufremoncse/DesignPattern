package com.codingsense.behavioral.strategy;

public class OperationSubstract implements Strategy {

	@Override
	public int doAction(int num1, int num2) {
		return num1 - num2;
	}

}
