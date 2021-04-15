package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode1457 {

    public static void main(String[] args) {


        boolean result = isPallindromic(Arrays.asList(1,2,2,3,4));
        System.out.println(result);
        //12234

    }

    public static boolean isPallindromic(List<Integer> ls){
            int isPallindrome=0;

            for(int i=1;i<10;i++){
                if(Collections.frequency(ls,i)%2==1){
                    ++isPallindrome;
                    if(isPallindrome>1){
                        return false;
                    }
                }
            }

            return true;
    }
}
