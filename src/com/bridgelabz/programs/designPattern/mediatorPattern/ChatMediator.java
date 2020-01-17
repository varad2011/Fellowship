package com.bridgelabz.programs.designPattern.mediatorPattern;

public interface ChatMediator {
	public void sendMessage (String msg, User user);
	void addUser(User user);
}
