package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NagarroEx {

    public static void main(String args[]){

List<Object> ls = new ArrayList();

        Map<Object, Integer> map = new HashMap();
        ls.add("a");
        ls.add(2);
        ls.add("b");
        ls.add("c");
        ls.add(3);
        ls.add("d");

        System.out.println(ls.size());

       for(Object o:ls){
          if(map.containsKey(o)){
              map.put(o,map.get(o)+1);
          }else{
              map.put(o,1);
          }

       }
       for(Map.Entry m:map.entrySet()){
           System.out.println(m.getKey()+":"+m.getValue());
       }




    }
}
