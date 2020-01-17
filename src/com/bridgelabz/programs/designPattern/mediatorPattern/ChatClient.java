package com.bridgelabz.programs.designPattern.mediatorPattern;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpI(); 
		User user1 = new UserImpl(mediator, "varad");
		User user2 = new UserImpl(mediator, "hanumant");
		User user3 = new UserImpl(mediator, "pranita");
		User user4 = new UserImpl(mediator, "rohan");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user4.send("Hii good mrng guys");
	}

}
