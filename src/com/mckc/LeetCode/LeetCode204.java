package com.mckc.LeetCode;

public class LeetCode204 {

    public static void main(String[] args) {

        int result = countPrimes(3);
        System.out.println(result);
    }


    public static int countPrimes(int n) {
        //counting primes less than n
        int count =0;
        if(n==0){
            return 0;
        }

        if(n==2){
            return 1;
        }
        if(n==3){

        }

        while(n>=2){
            for(int i=2;i<n/2;i++){
                if(n%i!=0){
                    count++;
                    break;
                }
            }
            n--;

        }
        return count;
    }
}
