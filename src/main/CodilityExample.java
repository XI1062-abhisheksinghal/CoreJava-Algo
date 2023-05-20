package main;

import java.util.Arrays;

public class CodilityExample {

    public static void main(String[] args) {

        int[] nums = {-1,10,6,7,-7,1};
        Arrays.sort(nums);

//        for(int i:nums){
//            System.out.println(i);
//        }

        int res=-1;
        for(int k=nums.length-1;k>0;k--){
            if(numExist(nums,nums[k])){

                res= nums[k];
                break;
            }
        }

        System.out.println(res);



    }

   static boolean numExist(int[] nums, int k){

        for(int j=0;j<nums.length;j++){
            if(nums[j] <0 && nums[j]==-k){
                return true;

            }        }
        return false;
    }
}
