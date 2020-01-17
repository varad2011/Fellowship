package com.bridgelabz.programs.designPattern.mediatorPattern;

public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + " sending msg " + msg);
		mediator.sendMessage(msg,this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " received msg" + msg);
	}

}
