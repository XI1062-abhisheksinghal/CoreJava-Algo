package com.mckc.LeetCode;

public class PushDominoes {

    public static void main(String[] args) {
        String s = ".L.R...LR..L..";
        System.out.println(pushDominoes(s));
    }

    public static String pushDominoes(String dominoes) {

        String res="";
        char[] chars = dominoes.toCharArray();
        if(chars[0]=='.'){
            if(chars[1]=='L'){
                res= res+'L';
            }else if(chars[1]=='R' || chars[1]=='.'){
                res = res + chars[1];
            }
        }
        for(int i=0;i<chars.length;i++){

            if(chars[i]=='L' || chars[i]=='R'){
                res= res+chars[i];
            }
            else{
                if(i<chars.length-1 && i!=0){
                    if( (res.charAt(i-1)=='L') && (chars[i+1]=='L' )){
                        res= res+'L';
                    }
                    else if(( (res.charAt(i-1)=='L') && (chars[i+1]=='R' )) || ((res.charAt(i-1)=='R') && (chars[i+1]=='L' ))){
                        res= res+'.';
                    }
                    else if( (res.charAt(i-1)=='R') && (chars[i+1]=='R' )){
                        res= res+'R';
                    }
                    else if(res.charAt(i-1)=='R' || chars[i+1]=='.'){
                        res = res+'R';
                    }
                }
            }
        }

        return res;
    }
}
