package com.codingsense.behavioral.chainofresponsibility;

public class Main {

	public static AbstractLogger getChainOfLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

		errorLogger.nextLogger = debugLogger;
		debugLogger.nextLogger = infoLogger;

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLogger();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

}
