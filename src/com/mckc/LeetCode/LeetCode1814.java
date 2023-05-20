package com.mckc.LeetCode;

public class LeetCode1814 {

    public static void main(String[] args) {

        int[] n = {42,11,1,97};
        System.out.println(countNicePairs(n));
    }


    public static int countNicePairs(int[] nums) {

        int count =0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(checkNicePair(nums[i],nums[j])){
                    count++;
                }

            }
        }

        return count;

    }



    public static boolean checkNicePair(int num1 , int num2){

        int sum1=0;
        int sum2=0;

        sum1 =reverse(num1)+num2;
        sum2 = num1+reverse(num2);

        if(sum1==sum2){
            return true;
        }

        return false;


    }

    public static Integer reverse(int no1){
        String s ="";
        int lastDigit = no1%10;
        int quo = no1/10;

        s= s+lastDigit;

        while(quo>0){
            int rem = quo%10;
            s= s+rem;
            quo= quo/10;
        }

        return Integer.valueOf(s);

    }
}
