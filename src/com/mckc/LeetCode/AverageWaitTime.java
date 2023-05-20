package com.mckc.LeetCode;

public class AverageWaitTime {

    public static void main(String[] args) {
        int[][] arr = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(arr));
    }

    public static  double averageWaitingTime(int[][] customers) {

        double average =0;
        double sum=0;
        int rows = customers.length;
        int waitTime=0;
        int[] waitTimes = new int[rows];

        int startTime = customers[0][0];
        int endTime = startTime+customers[0][1];
        waitTimes[0]=endTime-startTime;
        for(int i=1;i<rows;i++){
            if(customers[i][0]>endTime){
                waitTime = (customers[i][1]+customers[i][0])-customers[i][0];
                endTime = customers[i][1]+customers[i][0];
                waitTimes[i]=waitTime;
            }

            else {
                waitTime = endTime+customers[i][1]-customers[i][0];
                endTime = endTime+customers[i][1];
                waitTimes[i]=waitTime;
            }
        }

        for(int j=0;j<waitTimes.length;j++){
            sum = sum+ waitTimes[j];
        }

        average = sum/waitTimes.length;
        return average;
    }
}
