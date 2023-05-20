package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question49 {

    public static List<String> permutations= new ArrayList<String>();

    public static void main(String[] args) {

        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList();


        List<String> inputs = Arrays.asList(strs);

        while(inputs.size()>0){
            List<String> res = new ArrayList();

            findAllPermutations("",inputs.get(0));


            for(int j=0;j<permutations.size();j++){
                String toRemove= new String();

                String s = permutations.get(j);
                if(inputs.contains(s)){

                    toRemove=s;
                    res.add(s);
                }
                inputs.remove(s);
            }
            permutations.clear();

            result.add(res);




        }

        return result;
    }

    public static void findAllPermutations(String fixed,String unfixed){

        if(unfixed.length()==0){
            permutations.add(fixed);
            return;
        }

        for(int i=0;i<unfixed.length();i++){

            char fix = unfixed.charAt(i);
            String rest =unfixed.substring(0,i)+unfixed.substring(i+1);

            findAllPermutations(fixed+fix,rest);
        }




    }

}
