package com.mckc.LeetCode;

public class LeetCode2446 {

    public static void main(String[] args) {

        String[] event1={"14:13","22:08"};
        String[] event2={"02:40","08:08"};

        System.out.println(haveConflict(event1,event2));

    }

    public static  boolean haveConflict(String[] event1, String[] event2) {


        String[] event1StartTime = event1[0].split(":");
        Integer event1start = Integer.valueOf(event1StartTime[0]+event1StartTime[1]);

        String[] event1EndTime = event1[1].split(":");
        Integer event1end = Integer.valueOf(event1EndTime[0]+event1EndTime[1]);


        String[] event2StartTime = event2[0].split(":");
        Integer event2start = Integer.valueOf(event2StartTime[0]+event2StartTime[1]);

        String[] event2EndTime = event2[0].split(":");
        Integer event2end = Integer.valueOf(event2EndTime[0]+event2EndTime[1]);

        if((event2start<=event1end) && (event2start>= event1start)){
            return true;
        }

        if((event2end<=event1end) && (event2start>=event1start)){
            return true;
        }

        return false;
    }
}
