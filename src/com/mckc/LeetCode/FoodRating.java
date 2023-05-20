package com.mckc.LeetCode;


import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class FoodRating {

    public static Map<String, Pair> mapOfFood= new HashMap<>();

     public FoodRating(String[] foods, String[] cuisines, int[] ratings){

        for(int i=0;i<foods.length;i++){
            mapOfFood.put(foods[i],new Pair(cuisines[i],ratings[i]));
        }

    }

    public void changeRating(String food, int newRating) {
         Pair values = mapOfFood.get(food);

         Pair newValues = new Pair(values.getKey(),newRating);
         mapOfFood.put(food,newValues);
    }

    public String highestRated(String cuisine) {
        //return food with highest rating
        int rating=0;
        String food="";
        for(Map.Entry<String, Pair> m:mapOfFood.entrySet()){
            if(m.getValue().getKey().equals(cuisine)){
                if((int) m.getValue().getValue()>rating) {
                    rating = (int) m.getValue().getValue();
                    food = m.getKey();
                }
            }

        }

        return food;


    }

    public static void main(String[] args) {

         String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
         String[] cuisines= {"korean","japanese","japanese","greek","japanese","korean"};
         int[] ratings={9, 12, 8, 15, 14, 7};
         FoodRating foods1 = new FoodRating(foods,cuisines,ratings);

        System.out.println(foods1.highestRated("korean"));
        System.out.println(foods1.highestRated("japanese"));
        foods1.changeRating("sushi", 16);
        System.out.println(foods1.highestRated("japanese"));
        foods1.changeRating("ramen", 16);
        System.out.println(foods1.highestRated("japanese"));

        int[][] test = new int[2][3];
        test[0]=  new int[]{42};
        test[1]= new int[]{1};

        for(int i=0;i<test.length;i++){
            for(int j=0;j<test[0].length;j++){

                System.out.println(test[i][j]);
            }
        }


    }
}
