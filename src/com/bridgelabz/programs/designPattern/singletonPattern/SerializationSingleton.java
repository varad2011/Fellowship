package com.bridgelabz.programs.designPattern.singletonPattern;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
	private SerializationSingleton() {	
	}
	public static class SerializationHelper{
		private static SerializationSingleton instance = new SerializationSingleton();
	}
	public static SerializationSingleton getInstance(){
		return SerializationHelper.instance;
	}
	protected Object readResolve() {
		return getInstance();
	}
	public void display() {
		System.out.println("serialization pattern display");
	}
}
