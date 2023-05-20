package com.mckc.LeetCode;

public class GasStation134 {

    public static void main(String[] args) {

        int[] gas = {5,1,2,3,4};
        int[] cost ={4,4,1,5,1};

        System.out.println(canCompleteCircuit(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int backPosition =0;
        int gasStock=0;
        int move =0;
        int currPosition=0;
        int res=0;
        boolean flag=false;
        for(int j=0;j<gas.length;j++){
            int i=j;
            move=0;
            int currStation =i;
            gasStock=0;
            gasStock=gasStock+gas[i];
            move++;
             res=i;
            while(move!=gas.length && gasStock>0 && gasStock>cost[i]){
                currStation=i+1;
                if(i+1==gas.length){
                    i=0;
                    currStation=i;
                }

                gasStock =(gas[currStation]+gasStock)-cost[i];
                move++;
            }
            if(move==gas.length){
                flag =true;
                break;
            }
        }

        if(flag) {
            return res;
        }
        return -1;
    }
}
