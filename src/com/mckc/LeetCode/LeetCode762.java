package com.mckc.LeetCode;

public class LeetCode762 {

    static int count =0;
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6,10));
    }



    public static int countPrimeSetBits(int L, int R) {


        for(int r=L ;r<=R;r++){
            countOneandCheckPrime(r);
        }

        return count;

    }

    public static void countOneandCheckPrime(int n){

        int[] arr = new int[32];
        int i=0;
        int oneCount=0;
        while(n>0){
            if(n%2==1){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
            i++;
            n=n/2;
        }

        for(int k:arr){
            if(k==1){
                oneCount++;
            }
        }

        for(int j=2;j<oneCount/2;j++){
            if(oneCount/j==1){
                count++;
            }
        }

        if(oneCount==1){
            return;
        }

        return;
    }


}
