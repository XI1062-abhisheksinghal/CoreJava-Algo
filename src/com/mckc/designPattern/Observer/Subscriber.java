package com.mckc.designPattern.Observer;

public class Subscriber {
	
	private String name ;
	private Channel ch = new Channel();
	
	public Subscriber(String name) {
		this.name=name;
		
	}
	
	public void updated() {
		System.out.println("Subscriber subscribed"+ name+"video has been uploaded");
	}
	
	public void subscribeChannel(Channel ch ) {
		this.ch= ch;
	}
	
	

}
