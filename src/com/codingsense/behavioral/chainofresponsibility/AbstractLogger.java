package com.codingsense.behavioral.chainofresponsibility;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	protected int level;
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger abstractLogger) {
		this.nextLogger = abstractLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (this.nextLogger != null) {
			this.nextLogger.logMessage(level, message);
		}
	}

	abstract void write(String message);
}
