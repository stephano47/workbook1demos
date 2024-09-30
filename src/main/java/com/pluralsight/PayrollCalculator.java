package com.pluralsight;
import java.util.*;
public class PayrollCalculator {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    // Enter Name
    System.out.println("Welcome to the Payroll Calculator!\n" + "Please enter your First and Last Name.");
    String employeeName = scanner.nextLine();

    // Enter Hours

     System.out.println("Hello " + employeeName+"!\n" + "Please Enter the amount of hours you worked this week.");
     float hoursWorked = scanner.nextFloat();

     // Calculations and Final Step
        float payRate = 17;
        float grossPay = (hoursWorked * payRate);

        System.out.println("Thank You For Your Patience PLease see your information below.");
        System.out.println("Name: " + employeeName);
        System.out.println("Total Hours Worked: "+ hoursWorked);
        System.out.println("Total Pay: " + grossPay);




    }
}
