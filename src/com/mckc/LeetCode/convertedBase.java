package com.mckc.LeetCode;

public class convertedBase {

    public static void main(String[] args) {
     int n=9;
        System.out.println(checkLogic(4));

    }

    public static boolean checkLogic(int n){
        for(int i=2;i<n-2;i++){

            String con = convertedBase(n,i);

            if(!checkPallindromic(con)){
                return false;
            }
        }

        return true;
    }
    public static String convertedBase(int n, int base){

        String s1="";

        int num = n/base;
        int rem = n%base;
        s1= s1+String.valueOf(rem);


        while(num!=1){

            num=num/base;
            rem=num%base;
            s1=s1+rem;
        }

        return s1;
    }

    public static boolean checkPallindromic(String s){

        StringBuilder s1 = new StringBuilder(s);
        if(s1.reverse().equals(s)){
            return true;
        }

        return false;

    }
}

