package com.mckc.LeetCode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AliceBob {

    public static void main(String[] args) throws ParseException {

        LocalDate date1=LocalDate.of(2022,new Integer(02),28);
        LocalDate date2 = LocalDate.of(2022,01,28);

        long days = ChronoUnit.DAYS.between(date2, date1);

        System.out.println(days);

        if(date1.equals(date2)){
            System.out.println("Equal Dates");
        }
        long l = 12;

        int i = (int)l;

        System.out.println(i);

        System.out.println(countDaysTogether("09-01",
                "10-19",
                "06-19",
                "10-20"
        ));
    }

    public static int  countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        long result =0;
        String[] aliceArrivalArr= arriveAlice.split("-");

        Integer arriveAliceMonth = Integer.valueOf(aliceArrivalArr[0]);
        Integer arriveAliceDate= Integer.valueOf(aliceArrivalArr[1]);

        String[] bobArrivalArr=  arriveBob.split("-");

        Integer arriveBobMonth= Integer.valueOf(bobArrivalArr[0]);
        Integer arriveBobDate= Integer.valueOf(bobArrivalArr[1]);

        String[] aliceLeaveArr = leaveAlice.split("-");

        Integer aliceLeaveMonth= Integer.valueOf(aliceLeaveArr[0]);
        Integer aliceLeaveDate = Integer.valueOf(aliceLeaveArr[1]);

        String[] bobLeaveArr = leaveBob.split("-");
        Integer bobLeaveMonth = Integer.valueOf(bobLeaveArr[0]);
        Integer bobLeaveDate = Integer.valueOf(bobLeaveArr[1]);

        LocalDate aliceArrival=LocalDate.of(2022,arriveAliceMonth,arriveAliceDate);
        LocalDate bobArrival = LocalDate.of(2022,arriveBobMonth,arriveBobDate);

        LocalDate aliceLeave=LocalDate.of(2022,aliceLeaveMonth,aliceLeaveDate);
        LocalDate bobLeave = LocalDate.of(2022,bobLeaveMonth,bobLeaveDate);

        if(aliceArrival.isBefore(bobArrival) || aliceArrival.equals(bobArrival)){

            if(aliceLeave.isBefore(bobLeave)){
                   result = ChronoUnit.DAYS.between(bobArrival, bobLeave);
            }
            if(aliceLeave.isBefore(bobArrival)){

               result =0;

            }
            if(aliceLeave.isAfter(bobLeave)){

                result = Math.abs(ChronoUnit.DAYS.between(bobLeave, bobArrival));

            }
        }

        else if (bobArrival.isBefore(aliceArrival)){

            if(bobLeave.isBefore(aliceLeave)){

                result = Math.abs(ChronoUnit.DAYS.between(bobLeave, aliceArrival));

            }
            if(bobLeave.isBefore(aliceArrival)){
                result=0;
            }

            if(bobLeave.isAfter(aliceLeave)){

                result = Math.abs(ChronoUnit.DAYS.between(aliceLeave, aliceArrival));

            }

        }

        int res = (int)result;
        return res;

    }
}
