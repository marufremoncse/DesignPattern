package com.codingsense.behavioral.mediator;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Avik");
		User user2 = new User("Rashed");

		user1.sendMessage("Hi Rashed!!");
		user2.sendMessage("Hi Avik!! How are you?");
	}

}
