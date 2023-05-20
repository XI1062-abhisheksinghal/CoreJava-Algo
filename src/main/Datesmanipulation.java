package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Datesmanipulation {

    private static Pattern DATE_PATTERN = Pattern.compile(
            "^\\d{4}-\\d{2}-\\d{2}$");

    private boolean matches(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }

    public static void main(String[] args) throws ParseException {
        dateByUtilDate();
    }



    private static void dateByUtilDate() throws ParseException {
        String s= "2023-9-23 25:09:09:90";
        String s1 = "2023-09-13 09:00:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
        Date d1 = simpleDateFormat.parse(s);
        Date d2 = simpleDateFormat.parse(s1);

        long time = d1.getTime();
        long time2 = d2.getTime();

        long diff = Math.abs(time-time2);

        long days =TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
        System.out.println(days);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd hh:mm:ss");

    }


}
