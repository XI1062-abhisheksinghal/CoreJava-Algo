package com.mckc.LeetCode;

import java.util.Arrays;


public class LeetCode2357 {

    public static int minimumOperations(int[] nums) {

        //logic is to select the minimum number greater than 0 and subtract from each element in array
        int operations =0;
        for(int i=0;i<nums.length;i++){
            int smallest=selectSmallestGreaterthanZero(nums);
            if(nums[i]!=0){
                for(int m=i;m<nums.length;m++) {
                    nums[m] = nums[m] - smallest;
                }
                operations++;
            }

        }
        return operations;
    }

    static  boolean validPartition(int[] nums) {

        boolean flag=true;
        for(int i=0;i<nums.length;){
            int cont=0;
            int diff=0;
            for(int j=i+1;j<nums.length;){
                if(nums[i]==nums[j]){
                    cont++;

                }
                if(nums[i]+1==nums[j]){
                    diff++;

                }

                i++;
                j++;
            }

            if(!((cont==2 || cont==3) && diff==3)){
                flag= false;
                break;
            }
        }

        return false;

    }

    static int selectSmallestGreaterthanZero(int[] nums2) {
        Arrays.sort(nums2);
        int num = -1;
        for (int i = 0; i < nums2.length; i++) {
            if (num > 0) {
                break;
            }
            if (nums2[i] != 0) {
                num = nums2[i];
            }
        }
        return num;
    }


    public static int longestIdealString(String s, int k) {

        char[] chars= s.toCharArray();
        int len=0;
        String qualified="";
        for(int i=0;i<chars.length;i++){
            String result=String.valueOf(chars[i]);
            for(int j=i+1;j<chars.length;j++){

                if(Math.abs(chars[j]-result.charAt(result.length()-1))==k){
                    result=result+String.valueOf(chars[j]);

                }
            }

            if(result.length()>qualified.length()){
                len = qualified.length();
            }

        }

        return len;

    }

    public static boolean validPartition1(int[] nums) {



        return isValid(nums,0);

    }

    static boolean isValid(int[] nums, int index){
        boolean ans = false;

        if(index==nums.length){
            return true;
        }

        //case 1
        if(index+1< nums.length && nums[index]==nums[index+1]){
            ans = ans || isValid(nums,index+2);
        }

        //case 2
        if(index+2< nums.length && nums[index]==nums[index+1] && nums[index+1]==nums[index+2]){
            ans= ans || isValid(nums,index+3);
        }

        //case 3
        if(index+2< nums.length && nums[index]+1==nums[index+1] && nums[index+2]==nums[index+1]+1){
            ans = ans || isValid(nums, index+3);
        }

        return ans;

    }




    public static void main(String[] args) {
        int[] nums = {0};
        //System.out.println(minimumOperations(nums));

        Long engagementId = 1234456787L;
        System.out.println(engagementId);

        char a='a';
        char c='c';
        String s = String.valueOf(a);
        String name = "Abhishek";
        System.out.println(name.charAt(name.length()-1));
        System.out.println(s+c);

        System.out.println(c-a);

        //System.out.println(longestIdealString("acfgbd",2));

        int[] nums1 = {4,4,4,5,6};

        //System.out.println(validPartition(nums1));
        System.out.println(validPartition1(nums1));





    }

}
