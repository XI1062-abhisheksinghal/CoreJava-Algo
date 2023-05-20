package com.mckc.LeetCode;

public class FinalPrices {

    public static void main(String[] args) {

        int arr[]= {10,1,1,6};
       int[] res=finalPrices(arr);
        for(int i:res){
            System.out.println(i);
        }
    }

    public static int[] finalPrices(int[] prices) {

        int[] res = new int[prices.length];

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    int disc = prices[i]-prices[j];
                    res[i]=disc;
                    break;
                }

                else if(((j==prices.length-1) && (prices[j]>prices[i])))
                {
                    res[i]=prices[i];
                }else{
                    res[i]=prices[i];
                }
            }
        }
        res[res.length-1]= prices[prices.length-1];
        return res;
    }
}
