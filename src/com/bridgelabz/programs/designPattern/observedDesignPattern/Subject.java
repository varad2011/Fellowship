package com.bridgelabz.programs.designPattern.observedDesignPattern;



public interface Subject {

	public void registor(Observer observer);
	public void unregister(Observer o);
    public void notifyUpdate();
    public Object getUpdate(Observer object);
	}
