package com.mck.Java8Practice;

import java.util.HashMap;
import java.util.Map;

public class ExceptionEx {

    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();

        map1.put('c',1);
        map1.put('d',2);
        map1.put('e',3);
        map1.put('f',4);

        Map<Character,Integer> map2 = new HashMap<>();
        map2.put('d',2);
        map2.put('c',1);
        map2.put('f',4);
        map2.put('c',1);






    }

    public static void print(){
        System.out.println("Solution printed");
    }

    public static void add(int a , int b){

        //try {
            int c = a/0;

       // }catch(Exception e){
        //    System.out.println(e.getStackTrace());
       // }
    }
}
