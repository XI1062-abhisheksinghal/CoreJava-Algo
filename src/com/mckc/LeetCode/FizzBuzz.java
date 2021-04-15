package com.mckc.LeetCode;

public class FizzBuzz {

    public static void main(String[] args) {

      fizzBuzz(15);
    }

    public static void fizzBuzz(int n){

        int fizz=0, buzz=0;

        for(int i=1;i<=n;i++){
            fizz++;
            buzz++;
             if((fizz==3 && buzz==5)){
                fizz=0;
                buzz=0;
                System.out.println("fizzbuzz");
            }
            else if(buzz==5){
                 buzz=0;
                System.out.println("buzz");
            }
            else if((fizz==3 )){
                fizz=0;
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
