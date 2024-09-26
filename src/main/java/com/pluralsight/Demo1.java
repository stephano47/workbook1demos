package com.pluralsight;

import javax.naming.Name;

public class Demo1 {
    public static void main(String[]args){
        System.out.println("Hello World");

        char status ='m';
        int identifier = 1;
        String name = "Matt";
//remember hide command


        String greeting = "Hello " + name;



        int numberOfdaysPerWeekWatchesTv = 5;
        int MinutesperdayOnAverage = 90;

        int minutesperweek = numberOfdaysPerWeekWatchesTv * MinutesperdayOnAverage;
        int minutesperyear = minutesperweek * 52;

        int hoursperyear = minutesperweek / 60;

        int hoursinworkweek = 30;
        int workweeksperyearwatchingtv =  (5 * 70 * 52 / 60) / 30;

        System.out.println("if " + name + " did not watch tv, it would be like a " + workweeksperyearwatchingtv + " week vaction every year");
        System.out.println(greeting);


    }
}
