package com.mckc.LeetCode;

public class ShortDistance {

    public static void main(String[] args) {

        System.out.println(shortestToChar("loveleetcode",'e'));
    }

    public static int[] shortestToChar(String s, char c) {

        int lastOccurence=0;
        int[] result = new int[s.length()];

        lastOccurence = s.indexOf(c);

        for(int i=0;i<s.length();i++){

            char c1 = s.charAt(i);

            String s1 = s.substring(0,i);
            int newOccurence = s1.indexOf(c);

            if(c1==c){
                result[i]=0;
            }else{

                int diff = Math.abs(i-lastOccurence);
                int diff1 = Math.abs(i-newOccurence);

                if(diff<diff1){
                    result[i]=diff;
                }else{
                    result[i]=diff1;
                }
            }



        }

        return result;

    }
}
