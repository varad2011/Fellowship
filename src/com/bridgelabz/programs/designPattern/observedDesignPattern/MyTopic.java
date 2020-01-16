package com.bridgelabz.programs.designPattern.observedDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List <Observer> observer;
	private String message;
	private boolean change;
	private final Object finalObject = new Object();
	
	public MyTopic() {
	this.observer = new ArrayList<>();	
	}
	public void registor(Observer object) {
		if(object == null) throw new  NullPointerException("null observed");
		synchronized (finalObject) {
			if(!observer.contains(object)) {
				observer.add(object);
			}
		}
	}
	public void unregister(Observer object) {
		synchronized (finalObject) {
			observer.remove(object);
		}
	}
	
	@Override
	public void notifyUpdate() {
		List<Observer> observersLocal = null;
		synchronized (finalObject) {
			if (!change)
				return;
			observersLocal = new ArrayList<>(this.observer);
			this.change = false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}
	@Override
	public Object getUpdate(Observer object) {
		return this.message;
	}
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message = msg;
		this.change = true;
		notifyUpdate();
	}
}
	
