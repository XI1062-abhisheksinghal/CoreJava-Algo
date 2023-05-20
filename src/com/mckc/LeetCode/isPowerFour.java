package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class isPowerFour {

    public static boolean isPowerOfFour(int n){
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        boolean flag=false;
        double[] dp = new double[n/16];
        Arrays.fill(dp,-1);
        for(int i=1;i<n/16;i++){
            double power=0;

            if(dp[i-1]!=-1){
                power= dp[i-1]*4;
            }
            else{
                power = Math.pow(4,i);
                dp[i]=power;
            }
            if(power==n){
                flag=true;
            }
        }
        return flag;
    }

    public static int edgeScore(int[] edges) {

        Map<Integer, Integer> mapOfNodesScore = new HashMap();
        Integer maxNode =-1;
        Integer maxValue=0;
        for(int i=0;i<edges.length;i++){
            int sum=0;
            for(int j=0;j<edges.length;j++){
                if(i==edges[j])
                    sum = sum + j;
                mapOfNodesScore.put(i,sum);
            }
        }
        for(Map.Entry<Integer,Integer> m:mapOfNodesScore.entrySet()){

            if(m.getValue()>maxValue){
                maxValue=m.getValue();
                maxNode=m.getKey();
            }
        }

        return maxNode.intValue();

    }

    public static void main(String[] args) {

        //System.out.println(isPowerOfFour(387420488));

        //find Max from values in Map

        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();


        hashmap.put(0,3);
        hashmap.put(1,0);
        hashmap.put(2,3);
        hashmap.put(3,0);

       Integer maxKey= hashmap.entrySet().stream().max((entry1, entry2) ->
                entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get().getKey();

        //System.out.println(maxKey);

       Integer maxNode =-1;
       Integer maxValue=0;
        for(Map.Entry<Integer,Integer> m:hashmap.entrySet()){

            if(m.getValue()>maxValue){
                maxValue=m.getValue();
                maxNode=m.getKey();
            }
        }

        System.out.println(maxNode);
        int[] edges = {2,0,0,2};
        System.out.println(edgeScore(edges));

        //System.out.println(Collections.max(hashmap.values()));


    }
}
