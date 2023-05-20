package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LeetCode948 {

    public static void main(String[] args) {
        int[] nums = {100,200};
        int power= 150;

        System.out.println(bagOfTokensScore(nums,power));

    }

    public static int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int count=0;
        List<Integer> ls = Arrays.stream(tokens).boxed().collect(Collectors.toList());

       while(ls.size()>0){

            if(ls.get(0)<=power){
                Integer token = ls.get(0);
                power = power-token;
                ls.remove(ls.get(0));
                count++;
            }else{

                Optional<Integer> maxToken = ls.stream().max(Integer::compareTo);
                power = power+maxToken.get();
                ls.remove(maxToken.get());
                count--;
            }
        }

        if(count<0){
            return 0;
        }
        return count;
    }
}
