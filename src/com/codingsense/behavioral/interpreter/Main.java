package com.codingsense.behavioral.interpreter;

public class Main {

	public static Expression isMale() {
		Expression expression1 = new TerminalExpression("John");
		Expression expression2 = new TerminalExpression("Maruf");

		return new OrExpression(expression1, expression2);
	}

	public static Expression isMarriedWoman() {
		Expression expression1 = new TerminalExpression("Nusaibah");
		Expression expression2 = new TerminalExpression("married");

		return new AndExpression(expression1, expression2);
	}

	public static void main(String[] args) {
		Expression isMale = isMale();
		Expression isMarriedWoman = isMarriedWoman();
		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Nusaibah is a married woman"));
	}

}
