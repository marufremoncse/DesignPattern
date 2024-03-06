package com.codingsense.creational.singleton;

import javax.swing.UIDefaults.LazyInputMap;

public class SingleObject {
//	Early Initialization
//	private static SingleObject singleObject = new SingleObject();
//	public static SingleObject getObject() {
//		return singleObject;
//	}
	
//	Lazy Initialization
//	private static SingleObject singleObject;
//	public static SingleObject getObject() {
//		if(singleObject==null) {
//			singleObject = new SingleObject();
//		}
//		return singleObject;
//	}
	
//	Locking
//	private static SingleObject singleObject;
//	public static synchronized SingleObject getObject() {
//		if(singleObject==null) {
//			singleObject = new SingleObject();
//		}
//		return singleObject;
//	}
//	private SingleObject(){
//		
//	}
	
//	Double checked Locking
	private static volatile SingleObject singleObject;
	public static SingleObject getObject() {
		if(singleObject==null) {
			synchronized (SingleObject.class) {
				if(singleObject==null) {
					singleObject = new SingleObject();
				}
			}
		}
		return singleObject;
	}
	
	public void printHello() {
		System.out.println("Hello Programmer!!!");
	}
}
