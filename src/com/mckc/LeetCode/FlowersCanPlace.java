package com.mckc.LeetCode;

public class FlowersCanPlace {

    public static void main(String[] args) {

        int[] flowerbed = {1,0,1,0,1,0,1};
        int n = 0;

        System.out.println(canPlaceFlowers(flowerbed,n));
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {


        if(n==0){
            return true;
        }
        int size = flowerbed.length;
        int maxFlowers =0;
        int countOnes=0;
        if(size%2==0){
            maxFlowers = size/2;
        }
        else if (size%2==1){
            maxFlowers = (size+1)/2;
        }

        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                countOnes++;
            }
        }

        int flowersCanPlace = maxFlowers-countOnes;

        if((flowersCanPlace>0) && (flowersCanPlace>=n)){
            return true;
        }

        return false;

    }
}
