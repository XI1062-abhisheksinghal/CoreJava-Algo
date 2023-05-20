package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    //draw pascals triangle with given Number of num rows

    List<List<Integer>> pascal = new ArrayList();

    public static void main(String args[]){

        //print row of pascals triangle
        System.out.println(generate(5));


    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> levels ;

        //Pascals traingle

        for(int i=1;i<=numRows;i++){
            levels=new ArrayList<Integer>();
            if(i==1){
                levels.add(1);
                result.add(levels);
            }
            else if(i==2){
                levels.add(1);
                levels.add(1);
                result.add(levels);
            }
            else if(i>=3){
                levels.add(1);
                int j=0;

                List<Integer> ls = result.get(result.size()-1);
                while(j<ls.size()-1){
                    int num1= ls.get(j);
                    int num2= ls.get(j+1);
                    j++;
                    levels.add(num1+num2);
                }
                levels.add(1);
                result.add(levels);
            }
        }

        return result;

    }




}
