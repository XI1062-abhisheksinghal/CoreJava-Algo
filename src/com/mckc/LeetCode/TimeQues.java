package com.mckc.LeetCode;

public class TimeQues {

    public static void main(String[] args) {

        String time ="2?:?0";
        System.out.println(maximumTime(time));
    }

    public static String maximumTime(String time) {


        String[] splitedString = time.split(":");
        String res="";
        String hourRes ="";
        String minRes="";

        String hour = splitedString[0];
        String mins = splitedString[1];

        String f=hour.substring(0,1);
        String s=hour.substring(1);

        if(f.equals("?")){
            hourRes="2"+s;

        }

        if(s.equals("?")){
            if(f.equals("0") || f.equals("1")){
                hourRes=f+"9";
            }
            if(f.equals("2")){
                hourRes=f+"3";
            }
        }

        if(mins.substring(0,1).equals("?")){
            minRes=5+mins.substring(1);
        }

        if(mins.substring(1).equals("?")){
            minRes=9+mins.substring(0,1);
        }

        if(mins.substring(0,1).equals("?") && mins.substring(1).equals("?")){
            minRes= mins;
        }

        return hourRes+":"+minRes;

    }

}
