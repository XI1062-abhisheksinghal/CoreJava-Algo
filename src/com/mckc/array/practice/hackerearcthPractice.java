package com.mckc.array.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hackerearcthPractice {
	
	public static void main(String args[]) {
		
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try {
				String name = br.readLine();
				int inputs =Integer.valueOf(name);
				int[] nums = new int[inputs];
				for(int i=0;i<inputs;i++) {
					
					nums[i] = br.read();
					
				}
				
				for(int i:nums) {
					for(int j=1;j<=i;j++) {
						if((j%3==0) && (j%5!=0)) {
							System.out.println("Fizz");
						}else if((j%5==0) && (j%3!=0)){
							System.out.println(j);
						}else if((j%3==0) && (j%5==0)) {
							System.out.println("FizzBuzz");
						}else {
							System.out.println(j);
						}
					}
				}
				System.out.println(Integer.valueOf(name));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}

}
