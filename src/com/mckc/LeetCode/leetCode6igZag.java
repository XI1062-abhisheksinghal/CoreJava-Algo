package com.mckc.LeetCode;

public class leetCode6igZag {


    public static void main(String[] args) {

        String s = "AB";
        System.out.println(convert(s,1));
    }

    public static String convert(String s, int numRows) {

        //String s is given and numRows is given

        char[] chars = s.toCharArray();
        if(numRows==1){
            return s;
        }
        int row = -1;
        int col=0;
        char[][] fill= new char[numRows][s.length()];
        int i=0;
        int k=0;
        //Logic is row-- , col++ when the row reached the max length
       // for(int i=0;i<chars.length;i++){

        while(i<chars.length) {
            while (row < numRows-1 && i<=chars.length ) {
                row++;
                fill[row][col] = chars[i];
                i++;
            }
            while (row != 0 && i<chars.length) {
                row = row - 1;
                col = col + 1;
                fill[row][col] = chars[i];
                i++;
            }


        }
       // }

        return print2DArray(fill);




    }

    public static String print2DArray(char[][] print){

        String result ="";

        for(int i=0;i<print.length;i++){
            for(int j=0;j<print[0].length;j++){

                int value = (int)print[i][j];
                if(value!= 0){
                    result = result+Character.toString(print[i][j]);
                }
            }
        }
        return result;


    }
}
