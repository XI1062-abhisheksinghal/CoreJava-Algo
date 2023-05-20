package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutove {

    public static void main(String[] args) {
        int[] arr= {0,1,1,2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for(int n:nums){
            set.add(n);
        }
        int numsf[] = new int[set.size()];

        int k = 0;
        for (Integer x : set)
            numsf[k++] = x;

        Arrays.sort(numsf);
        int countSoFar=0;
        int finalcount=0;
        int j=0;

        for(int i=0;i<numsf.length;i++){
            while(j<numsf.length-1){

                if(numsf[j+1]==numsf[j]+1){
                    countSoFar++;
                }else{
                    break;
                }

                j++;
            }
            if(countSoFar>finalcount){
                finalcount=countSoFar+1;
            }
            countSoFar=0;
            j=i;
        }
        return finalcount;
    }
}
