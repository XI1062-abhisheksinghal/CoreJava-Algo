package com.mckc.LeetCode;

import java.util.Arrays;

public class MostProfit {

    public static void main(String[] args) {

        int[] difficulty = {13,37,58};
        int[] profit = {4,90,96};
        int[] worker = {34,73,45};

        System.out.println(maxProfitAssignment(difficulty,profit,worker));


    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        Arrays.sort(difficulty);
        int pro =0;
        for(int i=0;i<worker.length;i++){
            int ind = index(worker[i],difficulty);
            pro = pro + profit[ind];

        }

        return pro;

    }

    public static int index(int workerLoad, int[] difficulty){

        int index=-1;
        for(int i=0;i<difficulty.length;i++){
            index=i;
            if(difficulty[i]>workerLoad){
                index--;
                break;
            }
        }
        if(index==0){
            if(!(difficulty[0]<workerLoad)){
                index=-1;
            }
        }

        return index;

    }
}
