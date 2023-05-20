package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LeetCode1881 {

    public static void main(String[] args) {

        System.out.println(maxValue("-13",2));
    }

    public static String maxValue(String n, int x) {


        List<Integer> ls = new ArrayList<Integer>();
        String valx = String.valueOf(x);

        char c = n.charAt(0);
        boolean neg = false;
        if(n.charAt(0)=='-'){
            neg = true;
            n=n.substring(1,n.length());
        }
        for(int i=0;i<=n.length();i++){
            String res="";
            if(i==0){
                res = valx+n;
                if(neg){
                    res="-"+res;
                }
                ls.add(Integer.valueOf(res));
            }else{

            String s = n.substring(0,i);
            String next = n.substring(i,n.length());
            res = s+valx+next;
            if(neg){
                res= "-"+res;
            }
            ls.add(Integer.valueOf(res));
        }
        }


             Optional<Integer> result= ls.stream().max(Comparator.comparing(Integer::valueOf));

        Integer ress= result.get();
        return String.valueOf(ress);

    }
}
