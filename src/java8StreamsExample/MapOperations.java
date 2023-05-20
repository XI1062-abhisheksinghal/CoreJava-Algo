package java8StreamsExample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapOperations {

    public static void main(String[] args) {

        //return key with max value

        Map<Integer,Integer> maxKeyByValue = new HashMap<>();
        maxKeyByValue.put(1,2);
        maxKeyByValue.put(2,3);
        maxKeyByValue.put(3,3);


        //it should return 3
        Optional<Map.Entry<Integer, Integer>> val =
                maxKeyByValue.entrySet().stream()
                        .max(Comparator.comparing(Map.Entry<Integer, Integer>::getKey));

        System.out.println(val.get().getKey());

        //it should return smaller key when values are same
        int[][] hour = {{0,3},{2,5},{0,9},{1,15}};
        System.out.println(longestEmployeeTask(10,hour));

    }

    public static int longestEmployeeTask(int n , int[][] hours){
        int finalemployeeid = 0;
        int startTime =0;
        int longesttaskTime=0;
        for(int i=0;i<hours.length;i++){

            int taskTime = hours[i][1] - startTime;

            if(taskTime>longesttaskTime){
                longesttaskTime=taskTime;
                finalemployeeid=hours[i][0];
            }
            else if(taskTime==longesttaskTime){
                if(finalemployeeid>hours[i][0]){
                    finalemployeeid = hours[i][0];
                }
            }
            startTime = hours[i][1];
        }

        return finalemployeeid;
    }
}
