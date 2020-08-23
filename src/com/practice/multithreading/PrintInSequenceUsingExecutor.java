package com.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintInSequenceUsingExecutor {

	static class Executable implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName());
			System.out.println("A");

		}

	}

	static class ExecutableB implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName());
			System.out.println("B");

		}

	}

	public static void main(String args[]) throws InterruptedException {

		ExecutorService executor = Executors.newFixedThreadPool(1);
		Executable exe = new Executable();
		ExecutableB exec1 = new ExecutableB();

		for (int i = 0; i < 3; i++) {

			executor.execute(exe);
			executor.execute(exec1);
		}

	}

}
