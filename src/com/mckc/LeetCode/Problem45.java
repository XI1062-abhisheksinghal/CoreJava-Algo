package com.mckc.LeetCode;

public class Problem45 {
	
	public static void main(String args[]) {
		
		
		int[] arr= {2,3,1,1,4};
		//System.out.println(minJump(arr));
		System.out.println(canJump(arr));
		
		
		
	}
	
	public static int minJump(int[] nums) {
	int curEnd = 0;
    int cufFarthest = 0;
    int jumpStep = 0;

    for (int i = 0; i <nums.length -1 ; i++) {
        cufFarthest = Math.max(cufFarthest, nums[i] + i);
        if(i == curEnd)
        {
            jumpStep++;
            curEnd = cufFarthest;
        }
        if(curEnd >= nums.length -1)break;

    }


    return jumpStep;
}
	
	public static boolean canJump(int[] nums) {
		
		  
        int max = 0;
   for(int i=0;i<nums.length;i++){
       if(i>max) {return false;}
       max = Math.max(nums[i]+i,max);
   }
   return true;
   }
	

}
