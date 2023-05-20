package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1539 {

    public static void main(String[] args) {
        int[] nums = {1,13,18};

        System.out.println(findKthPositive(nums, 17));

    }


    public static int findKthPositive(int[] arr, int k) {


        List<Integer> missingNumbers = new ArrayList<Integer>();
        List<Integer> numbers = new ArrayList<Integer>();
        int limit = arr[arr.length-1];

        for(int i=0;i<arr.length;i++){
            numbers.add(arr[i]);
        }

        for(int j=1;j<=limit;j++){

            if(!numbers.contains(j)){

                missingNumbers.add(j);
            }
        }

        if(k>missingNumbers.size()){
            if(missingNumbers.size()==0){
                return limit+k;
            }
            int m =k- missingNumbers.size()-1;
            int last =missingNumbers.get(missingNumbers.size()-1);
            return m+last;
        }
        return missingNumbers.get(k-1);


    }
}
