package com.mckc.array.practice;

public class ReverseOfANumber {

    public static void main(String args[]){

        System.out.println(reverseNumber(1233123121));
    }

    public static int reverseNumber(int x){

        String result="";
        while(x>0){
            int rem = x%10;
            x = x/10;
            result = result+rem;
        }

        return Integer.valueOf(result);
    }
}
