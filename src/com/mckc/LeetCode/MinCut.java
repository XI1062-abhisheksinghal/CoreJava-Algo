package com.mckc.LeetCode;

public class MinCut {

    public static void main(String[] args) {

        System.out.println(minCut("aab"));

    }

    public static int minCut(String s) {

        int cut=0;
        if(s.length()==1){
            return 0;
        }
        else if(s.length()==2 && s.charAt(0)!=s.charAt(1)){
            return 1;
        }

        for(int i=0;i<s.length()-1;i++){
            String trimmedleft = s.substring(0,i+1);
            String trimmedright = s.substring(i+1);
            if(isPallindromic(trimmedleft) && isPallindromic(trimmedright)){
                cut++;
                break;
            }
        }

        return cut;

    }


    public static boolean isPallindromic(String s){
        if(s.length()==1){
            return true;
        }
        StringBuffer sb = new StringBuffer(s);
        return sb.equals(sb.reverse());
    }
}
