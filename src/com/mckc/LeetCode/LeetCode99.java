package com.mckc.LeetCode;


public class LeetCode99 {

    public static void main(String[] args) {

        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries ={{0,2},{1,4},{1,1}};
        for(int i :vowelStrings(words,queries)){
            System.out.println(i);
        }
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {

        int[] result = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            result[i]=countSpecialStrings(words,queries[i][0],queries[i][1]);
        }
        return result;
    }

    public static int countSpecialStrings(String[] words,int starts, int end){
        int k=0;
        for(int j=starts;j<=end;j++){
            if(checkSpecial(words[j])){
                k++;
            }
        }
        return k;
    }

    public static boolean  checkSpecial(String word){

        int len = word.length();

        if(word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' || word.charAt(0)=='o' || word.charAt(0)=='u'){
            if(word.charAt(len-1)=='a' || word.charAt(len-1)=='e' || word.charAt(len-1)=='i' || word.charAt(len-1)=='o' || word.charAt(len-1)=='u'){

                return true;
            }
        }

        return false;
    }


}
