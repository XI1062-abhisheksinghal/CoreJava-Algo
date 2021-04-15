package com.mckc.LeetCode;

public class LeetCode220 {

    public static void main(String[] args) {

        int arr[] = {8,7,15,1,6,1,9,15};
        int k=1;
        int t=3;

       boolean value= containsNearbyAlmostDuplicate(arr,k,t);
        System.out.println(value);
    }


    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {


        //List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    if ((Math.abs(i - j) <= k)) {
                        if (Math.abs(nums[i] - nums[j]) <= t) {

                            flag = true;
                        }
                    }
                }
            }
        }

        return flag;
    }
}