package com.mckc.LeetCode;

public class LeetCode1678 {

    public static void main(String[] args) {

        String parse = "G()(al)(al)";
        //String output = "Goalal";
        String out ="";
        char[] chars = parse.toCharArray();

        for(int i=0;i<chars.length;){

            if(chars[i]=='G'){
                out=out+'G';
                i++;
            }

            if(chars[i]=='('){
                if(chars[i+1]==')'){
                    out=out+'o';
                    i++;
                }else{
                    out=out+"al";
                     i=i+4;
                }
            }
        }

        System.out.println(out);
    }
}
