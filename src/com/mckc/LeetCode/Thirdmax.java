package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Thirdmax
{

    public static void main(String[] args) {

        int[] maxNums= {1,2,2,5,3,5};
        System.out.println(thirdMax(maxNums));
    }

    public static int thirdMax(int[] nums) {

    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(3);
    List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    List<Integer> listDistinct = list.stream().sorted().distinct().collect(Collectors.toList());

    if(listDistinct.size()<3){
        return listDistinct.get(listDistinct.size()-1).intValue();
    }

    int count=1;
    for(Integer i:listDistinct){
        if(count<3){
            queue.add(i);
        }else{
            if(i>queue.peek()){
                queue.add(i);
            }
        }
        count++;
    }

    return queue.peek().intValue();
}
}
