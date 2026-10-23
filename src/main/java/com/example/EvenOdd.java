
package com.example;

public class EvenOdd {

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java EvenOdd <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(number + " is " + checkEvenOdd(number));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
