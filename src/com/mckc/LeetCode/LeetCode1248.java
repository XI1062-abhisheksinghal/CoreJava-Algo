package com.mckc.LeetCode;

public class LeetCode1248 {

    public static void main(String[] args) {

        int num[] = {2,2,2,1,2,2,1,2,2,2};
        int k=2;

        System.out.println(numberOfSubarrays(num,k));


    }

    public static  int numberOfSubarrays(int[] nums, int k) {

        int l=0;
        int r=-1;
        int odd=0;
        int count =0;

        while(r<nums.length-1){
            r++;
            if(nums[r]%2==1){
                odd++;
            }

            if(odd==k){
                int left =1;
                int right=1;

                while(r<nums.length-1 && nums[r+1]%2==0){
                    right++;
                    r++;
                }

                while(l<=r && nums[l]%2==0){
                    left++;
                    l++;
                }

                count+=left*right;
                l++;
                odd--;
            }

        }

        return count;
    }
}
