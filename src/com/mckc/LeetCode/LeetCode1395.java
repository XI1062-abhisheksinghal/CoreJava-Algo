package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1395 {
        static int count =0;
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(numTeams(nums));
    }

    public static int numTeams(int[] rating) {

        int length =1;

        List<Integer> ls = new ArrayList<Integer>();

        boolean increase=false;
        boolean decrease= false;



        for(int i=0;i<rating.length;i++){
            for(int j=i+1;j<rating.length;j++){

                if(rating[i]<rating[j]){
                    increase=true;
                }else{
                    decrease=true;
                }

                if(increase){
                    if(rating[j]>rating[i]){
                        decrease= false;
                        length++;
                    }

                }
                if(decrease){
                    if(rating[i]<rating[j]){
                        increase= false;
                        length++;
                    }
                }

                if(length==3){
                    count++;
                    break;
                }
            }
            increase= false;
            decrease=false;


            length=0;

        }

        return count;
    }

}
