package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

//Start
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thank you for using the Basic Calculator!");

        // First And Second Number Entry
        System.out.println("Please enter your first number.");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter your second number.");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        // Requesting what to use to calculate numbers
        System.out.println("Possible Calculations:\n" + "Add\n" + "Subtract\n" + "Divide\n" + "Multiply\n" +  "How would you wish to calculate the numbers you entered?");
        String calc = scanner.nextLine();

        // Calculation Options






        // Calculating
        if (calc.equalsIgnoreCase(("Add")) || calc.equalsIgnoreCase(("A"))) {
            System.out.println(firstNumber + secondNumber);
        } else if (calc.equalsIgnoreCase(("Subtract")) || calc.equalsIgnoreCase(("S"))) {
            System.out.println(firstNumber - secondNumber);
        } else if (calc.equalsIgnoreCase(("Multiply")) || calc.equalsIgnoreCase(("M"))) {
            System.out.println(firstNumber * secondNumber);
        } else if (calc.equalsIgnoreCase(("Divide")) || calc.equalsIgnoreCase(("D"))) {
            if (secondNumber ==0) {
                System.out.println("ERROR Undefined:\n" + "The Second number cannot be zero please try again");
            }
            System.out.println(firstNumber / secondNumber);

        }

      }
    }

