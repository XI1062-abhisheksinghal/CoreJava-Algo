package com.mckc.designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	String title ;
	List<Subscriber> subs = new ArrayList<>();
	
	
	
	public void notifyObserver() {
		for(Subscriber sub:subs) {
			sub.updated();
		}
	}
	
	public void registerSubscriber(Subscriber sub) {
		subs.add(sub);
	}
	
	public void deregisterSubscriber(Subscriber sub) {
		
		subs.remove(sub);
	}
	
	public void upload(String title) {
		
		this.title= title;
		notifyObserver();
		
	}
	
	
	

}
