package com.mckc.array.practice;

public class demo {
	
	public static void main(String args[]) {
		
		int n=300;
		
		//String s =Long.toBinaryString(x);
		//System.out.println(s);
		String num="";
		
		for(int i=1;i<=n;i++){
            num=num.concat(Long.toBinaryString(i));
        }
		System.out.println(num);
		
		Double res =Double.parseDouble(num.trim());
		Long l = res.longValue();
		System.out.println(res);
		System.out.println(l);
		//String s = i.toString();
		//System.out.println(s);
		
		
		int decimal = 0 ;
	       int p =0;
	       while(true){
	           if(l==0){
	               break;
	           }else{
	               double temp = l %10;
	               decimal+=temp*Math.pow(2,p);
	               l=l/10;
	               p++;
	           }
	       }
	       
		
		System.out.println(decimal);
		
		
		
		
		
	}

}
