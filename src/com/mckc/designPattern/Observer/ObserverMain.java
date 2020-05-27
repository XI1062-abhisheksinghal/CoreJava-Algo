package com.mckc.designPattern.Observer;

public class ObserverMain {
	
	public static void main(String args[]) {
		
		Channel ch = new Channel();
		
		
		
		Subscriber sub1 = new Subscriber("Ankur");
		Subscriber sub2 = new Subscriber("Abhishek");
		Subscriber sub3 = new Subscriber("Devansh");
		Subscriber sub4 = new Subscriber("Megha");
		
		ch.registerSubscriber(sub1);
		ch.registerSubscriber(sub2);
		ch.registerSubscriber(sub3);
		ch.registerSubscriber(sub4);
		
		sub1.subscribeChannel(ch);
		sub2.subscribeChannel(ch);
		sub3.subscribeChannel(ch);
		sub4.subscribeChannel(ch);
		
		ch.upload("Learning Observer Design Pattern");
		
		
		
		
		
	}

}
