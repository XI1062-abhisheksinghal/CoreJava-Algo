package com.mckc.LeetCode;

public class LeetCode1052 {

    public static void main(String[] args) {

        int cust[]= {1};
        int[] grumpy ={0};
        int minutes =1;
        System.out.println(maxSatisfied(cust,grumpy,minutes));
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //finding a window whose sum is maximum for given window size , here minutes is window size

        int windowSize = minutes ;
        int start =0;
        int finalstartindex=0;
        int finalendindex=0;
        int maxSoFar =0;
        for(int i=start;i<=customers.length-minutes;i++){
            int move=0;
            int j=i;
            int sum=0;
            while(move<minutes){
                sum = sum+customers[j];
                move++;
                j++;
            }
            if(sum>maxSoFar){
                finalstartindex=i;
                finalendindex=i+2;
                maxSoFar=sum;
            }
        }

        for(int k=0;k<grumpy.length;k++){

            if(grumpy[k]==0){
                if((k<finalstartindex || k >finalendindex)){
                    maxSoFar=maxSoFar+customers[k];
                }
            }
        }

        return maxSoFar;
    }
}
