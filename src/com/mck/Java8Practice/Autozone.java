package com.mck.Java8Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Autozone {

    public static void main(String[] args) {

        //united states -- 2 letter code (TN)
        System.out.println(formalNameofState("NY"));
        LocalDateTime startDate= LocalDateTime.now();
        System.out.println(startDate);
        System.out.println(startDate.format(DateTimeFormatter.ISO_DATE));


    }

    // {baseUrl}/states/{stateId}  -> uri
    // Controller ---> @RestController (@Controller)

//    @GetMapping("/states/{stateId}")
//    public ResponseEntity<String> getStateName(@RequestParam String code){
//
//        return ResponseEntity.of(service.formalNameofState(code));
//    }
    // Service ---> @Service
    // Database Layer (Spring Data JPA ) --> @Repository
//{
//    "New York";
//}
    public static String formalNameofState(String code){

        String result="";
        Map<String, String> mapOfStateName = new HashMap<>();
        mapOfStateName.put("NY","New York");
        mapOfStateName.put("TN","Tennesse");
        //source of data to populate the map key and values
        //"NY"-->"New York"
        //"TN"-->"Tennesse"
        Map<String,String> sortedMap=
                mapOfStateName.entrySet().stream().sorted(comparingByValue())
                        .collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
        int [] nums = {1,2,3};
//        AtomicInteger indexOfMaxSoFar= new AtomicInteger();
//        sortedMap.entrySet().forEach(map-> System.out.println(map.getKey()+ " "+map.getValue()));
//        sortedMap.entrySet().forEach(map->{
//            if(map.getValue()> indexOfMaxSoFar.get()){
//                indexOfMaxSoFar.set(map.getValue());
//            }
//        });

        //System.out.println(nums[indexOfMaxSoFar.get()]);

        if(mapOfStateName.size()<1){
            result="No data present";
        }
        if(mapOfStateName.containsKey(code)){
            result=mapOfStateName.get(code);
        }

        return result;
    }







}
