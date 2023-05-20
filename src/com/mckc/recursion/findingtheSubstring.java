package com.mckc.recursion;

public class findingtheSubstring {


    public static void main(String args[]){

        String s = "abc";
        String fixed ="";

        permute(fixed,s);

    }

    //src :- https://www.youtube.com/channel/UCkuf0J8yRtrkbtg_ShcfzRQ
    public static void permute(String fixed, String unfixed){

        if(unfixed.length()==0){
            System.out.println(fixed);
        }

        for(int i=0;i<unfixed.length();i++){

           char fix = unfixed.charAt(i);
           String rest = unfixed.substring(0,i)+ unfixed.substring(i+1);

           permute(fixed+fix, rest);



        }

    }
}
