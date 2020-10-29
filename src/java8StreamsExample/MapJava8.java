package java8StreamsExample;

import java.util.*;
import java.util.stream.Collectors;

public class MapJava8 {

    public static void main(String args[]){

        Map<Integer,Integer> m = new HashMap();



        m.put(1,3);
        m.put(2,1);
       List<String> ls = new ArrayList<>();

       ls.add("abhi");
       ls.add("alka");
       ls.add("geek");
       ls.add("schindler");

       char ch = 'a';

       //create a map whose key is starting by a and list as value .





        //Sort the map enteries by Values in java 8
       Map<Integer, Integer> m2=m.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));

        //print that key from map object whose value is 1
       for(Map.Entry<Integer, Integer> m1:m2.entrySet()){

           if(m1.getValue()==1) {
               System.out.println(m1.getKey());
           }

       }





    }
}
