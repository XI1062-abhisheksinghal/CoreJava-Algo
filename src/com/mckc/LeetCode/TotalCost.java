package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotalCost {

    public static void main(String[] args) {
        int[] costs = {17,12,10,2,7,2,11,20,8};
        System.out.println(totalCost(costs,3,4));
    }



    public static long totalCost(int[] costs, int k, int candidates) {

        List<Integer> listOfCost = Arrays.stream(costs).boxed().collect(Collectors.toList());
        long totalCost =0;
        for(int j=0;j<k;j++){
            int count =0;
            int initialIndex =0;
            int lastIndex = listOfCost.size()-1;
            int exact=0;
            int indexRemoved=0;
            if(listOfCost.size()>=candidates*2){
                while((count<candidates) || (initialIndex<lastIndex) ){
                    count++;
                    int found = listOfCost.get(initialIndex);
                    int foundlast = listOfCost.get(lastIndex);
                    if(found<foundlast){
                        exact = found;
                        indexRemoved=initialIndex;
                    }else{
                        exact = foundlast;
                        indexRemoved=lastIndex;
                    }
                    initialIndex++;
                    lastIndex--;

                }
                totalCost=totalCost+exact;
                listOfCost.remove(indexRemoved);

            }else{
                int minSoFar =listOfCost.get(0);
                for(int l=1;l<listOfCost.size();l++){
                    if(minSoFar>listOfCost.get(l)){
                        minSoFar=listOfCost.get(l);
                    }
                    totalCost = totalCost+minSoFar;
                }
                listOfCost.remove(minSoFar);
            }
        }

        return totalCost;

    }
}
