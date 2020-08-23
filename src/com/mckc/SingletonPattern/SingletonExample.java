package com.mckc.SingletonPattern;

public class SingletonExample {
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	Integer id;
	
	private SingletonExample() {
		
	}
	
	public static SingletonExample instance;
	
	public static SingletonExample getInstance() {
		//this is single null check 
		if(instance==null) {
			return new SingletonExample();
		}
		
		return instance;
		
	}
	
	

}
