package com.mckc.LeetCode;

public class cons1 {

    public static void main(String[] args) {

        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxSofar =0;
        int currMax =0;

        for(int i=0;i<nums.length;i++){
            int j=i;
            if(nums[i]==1){
                currMax++;
                while(j<nums.length-1 && nums[++j]==1 ){
                    currMax++;

                }
            }

            if(currMax>maxSofar){
                maxSofar= currMax;
            }

            if(maxSofar>=nums.length/2){
                break;
            }
            currMax=0;

        }

        return maxSofar;

    }
}
