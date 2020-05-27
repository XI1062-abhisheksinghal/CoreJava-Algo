package com.practice.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask1 implements Callable {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		
			
		return new Random().nextInt();
		
		
	}

}
