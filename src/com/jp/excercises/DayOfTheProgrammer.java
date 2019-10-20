package com.jp.excercises;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DayOfTheProgrammer {


    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(1918));

    }

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        int day = year < 1918 ? (year%4==0&&year%100==0) ? 255 : 256 : 256;

        if(year == 1918)
            return  "26.09.1918";

        ZonedDateTime zdt = ZonedDateTime.now().withYear(year).withDayOfYear(day).withZoneSameInstant(ZoneId.of("Europe/Moscow"));

        return DateTimeFormatter.ofPattern("dd.MM.yyyy").format(zdt);

    }

}
