package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Problem {

    @FunctionalInterface
    interface func{
        //int sum(int i, int j);
        void slen(String name);
    }

    public static void main(String[] args) {


        int[] stocks = {7, 1, 5, 6, 3, 4};
        //buy one one day and sell on another day

        int max = 0;
        List<Integer> listOfstocksPrices = Arrays.stream(stocks).boxed().collect(Collectors.toList());


        AtomicInteger max1= new AtomicInteger();

        listOfstocksPrices.forEach((i)->{

                int max2=0;
                int ele = i;
              List<Integer>  listOfstocksPrices1=  listOfstocksPrices.subList(i,listOfstocksPrices.size()-1);
            listOfstocksPrices1.forEach((j)->{
              if(i!=j){
                  if(j>ele){
                      int diff = j-ele;
                      if(diff>max2){
                          max1.set(max2);
                      }
                  }
              }

            });

        });

        System.out.println(max1);

        int sum = listOfstocksPrices.stream().reduce((a,b)->a+b).get();

//        func f = ((a,b)->{
//            return a+b;
//        });
        //implementation of functional interface by lambda's

//        func f1 =((s)->{
//           return  s.length();
//        });
        //implementation of functional interface
        func f =((s)->{
            System.out.println(s);
        });
        //call of functional interface
        f.slen("abhi");

        Thread t = new Thread(()->{
            System.out.println("inside thread");
        });



        System.out.println(sum);
       for(int i=0;i<stocks.length;i++){
           int buy= stocks[i];
           int currMax=0;
           for(int j=i+1;j<stocks.length;j++){
               if(stocks[j]>buy){
                   currMax= stocks[j]-buy;
                   if(currMax>max){
                       max=currMax;
                   }
               }
           }

       }

       //writing the above logic using java 8



        System.out.println(max);
    }





}
