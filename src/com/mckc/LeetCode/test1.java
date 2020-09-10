package com.mckc.LeetCode;

public class test1 {
	
		public static void main(String args[]) throws InterruptedException
		  {
		    Hacker obj = new Hacker();
		    Thread t = new Thread(obj,"Java");
		    Thread t1 = new Thread(obj,"PHP");
		    t.start();
		    t.join();
		    t1.start();
		  }

	
	
	public static void compare(String str, String regex)
	{
	    if (str.matches(regex))
	    {
	        System.out.println(str + " matches");
	    }
	    else
	    {
	        System.out.println(str + " does not match");
	    }
	}
	
	
	
	
}
