package com.company;

public class Current_Time_method {
    public static void main(String[] args) {
        //obtain current milliseconds since midnight 1 jan 1970
        long totalMilliseconds= System.currentTimeMillis();
        //Obtain the total seconds by divide the total milliseconds by 1000
        long totalSeconds= totalMilliseconds/1000;
        //calculating current second in minute in the hour by divide totalSeconds by (%) reminding 60
        long currentSecond=totalSeconds % 60;
        //Obtain total minutes by divide totalSeconds into 60
        long totalMinutes= totalSeconds/60;
        //calculating current minute in hour by (%) reminding the totalMinutes by 60
        long currentMinute= totalMinutes % 60;
        //obtain total hours by divide totalMinutes by 60
        long totalHours= totalMinutes / 60;
        //calculating current hours by(%) reminding totalHours by 24
        long currentHours= totalHours % 24;

        //display Result
        System.out.println("The current time is "+ currentHours +":" + currentMinute+ ":" + currentSecond + " GMT");

    }







}
