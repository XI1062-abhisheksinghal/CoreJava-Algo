package com.mckc.array.practice;

import java.text.NumberFormat;

public class eg2 {
	
	public static void main(String args[]) {
		
		
		// TODO Auto-generated method stub
NumberFormat nf = NumberFormat.getInstance();
nf.setMaximumFractionDigits(4);
nf.setMinimumFractionDigits(2);

String a = nf.format(3.1415926);
String b= nf.format(2);

System.out.println(a);
System.out.println(b);
	}
}

