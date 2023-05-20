package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTopKHotels {

    public static void main(String[] args) {

        List<String> reviews = new ArrayList<String>();
        reviews.add("This hotel has a nice view of the city center. The location is perfect.");
        reviews.add("The breakfast is ok. Regarding location, it is quite far from city center but the price is cheap so it is worth.");
        reviews.add("Location is excellent, 5 minutes from the city center. There is also a metro station very close to the hotel.");
        reviews.add("They said I couldn’t take my dog and there were other guests with dogs! That is not fair.");
        reviews.add("Very friendly staff and a good cost-benefit ratio. Its location is a bit far from the city center.");

        List<String> positiveWords = new ArrayList<>();
        positiveWords.add("breakfast beach city center location metro view staff price");

        List<String> negativeWords = new ArrayList<>();
        negativeWords.add("not");

        int totalHotels =5 ;

        int[] hotelIds = {1,2,1,1,2};

        int positiveScore = 3;
        int negativeScore = -1;

        //return hotel id in reverse order of popularity
        Map<Integer, Integer> mapOfReviewCountHotelId = new HashMap<Integer, Integer>();
        int positiveCount=0;
        for(int i=0;i<totalHotels;i++){

            for(int j=0;j<=positiveWords.size();j++){
                String positiveWord = positiveWords.get(j);
                for(int k=0;k<reviews.size();k++){
                    if(reviews.get(k).contains(positiveWord)){
                        if(mapOfReviewCountHotelId.containsKey(i)){
                            mapOfReviewCountHotelId.put(i,mapOfReviewCountHotelId.get(i)+3);
                        }else{
                            mapOfReviewCountHotelId.put(i,3);
                        }
                    }



                }            }
        }

    }
}
