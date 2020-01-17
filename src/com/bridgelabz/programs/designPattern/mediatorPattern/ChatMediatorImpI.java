package com.bridgelabz.programs.designPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpI implements ChatMediator{
	private List<User> users;
	
	public ChatMediatorImpI() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for(User user1 : this.users ) {
			if(user1 != user) {
				user1.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
}
