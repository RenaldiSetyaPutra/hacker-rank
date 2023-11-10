package com.example.hackerrank.Utils.Easy;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2015;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeekk = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        String dayS = daysOfWeekk[dayOfWeek - 1];

        System.out.println(dayS);
    }
}
