package com.mckc.LeetCode;

public class LeetCode1598 {

    public static void main(String[] args) {

        String arr[] = {"d1/","d2/","../","d21/","./"};
        int res =loopCheck(arr) ;
        System.out.println(res);
    }

  static int loopCheck(String[] logs){
    int count =0;

        for(int i=0;i<logs.length;i++){

        String[] s = logs[i].split("/");

        if(s[0].equals("..")){
        count--;
        }
        else if(s[0].equals(".")){
        continue;
        }
        else{
        count++;
        }
        }
        return count;
        }
}