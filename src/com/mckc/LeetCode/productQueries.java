package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class productQueries {

    public static void main(String[] args) {
        int [][] queries = {{0,0}};
        System.out.println(productQueries(2,queries));

    }

    public static int[] productQueries(int n, int[][] queries) {

        List<Double> powers = new ArrayList<>();

        List<Double> result = new ArrayList<>();

        int j=0;
        Double pow = Math.pow(2,j);
        powers.add(pow);
        while(pow<=n){
            j++;
            pow=Math.pow(2,j);
            powers.add(pow);
        }

        for(int k=0;k<queries.length;k++){
            int start = queries[k][0];
            int end = queries[k][1];
            int f = start;
            double mul =1;
            while(f<=end){
                mul = mul * powers.get(f);
                f++;
            }
            result.add(mul);
        }
        int[] res= new int[result.size()];
        int p=0;
        for(Double l : result){
            res[p]=l.intValue();
            p++;
        }

        return res;
    }
}
