package com.practice.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreUseCase {
	
	
	public void sharedResource() {
		
		System.out.println("Inside the Shared Resource function");
	}
	
	
	public static void main(String args[]) {
		
		SemaphoreUseCase useCase = new SemaphoreUseCase();
		
		Semaphore sem = new Semaphore(2);
		
		
		Thread t = new Thread(()-> {
			//System.out.println("Thread A has acquired a lock");
			try {
				Thread.currentThread().setName("Thread A");
				sem.acquire();
				System.out.println("Thread A acquire");
				useCase.sharedResource();
				Thread.sleep(5000);
				sem.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		

		Thread t2 = new Thread(()-> {
			//System.out.println("Thread B has acquired a lock");
			try {
				sem.acquire();
				System.out.println("Thread B acquire");
				useCase.sharedResource();
				Thread.sleep(5000);
				sem.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		 Thread t3 = new Thread(()-> {
			//System.out.println("Thread C has acquired a lock");
			try {
				sem.acquire();
				System.out.println("Thread C acquire");
				useCase.sharedResource();
				Thread.sleep(5000);
				sem.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
