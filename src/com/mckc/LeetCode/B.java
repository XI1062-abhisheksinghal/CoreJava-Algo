package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;


class A{

    public int x;

    protected int y;

    void cal(int a, int b){

        x =  a + 1;

        y =  b;

    }        

}    
 class B {
	
	
		
		 public static void main(String[] main) {
			 {

			        A obj = new A();   

			        obj.cal(2, 3);

			        System.out.println(obj.x + " " + obj.y);     

			    }
	}

}
