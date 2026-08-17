/**
 *  Java program to read numbers from a user a calculate their sum.
 */

package com.myloop;

import java.util.Scanner;

// Main class.
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        System.out.println("How many numbers do you want to add?");

        // Amount of numbers.
        int amount = Integer.parseInt(scanner.nextLine());

        // Sum of numbers.
        int sum = 0;

        while (amount != 0){
            System.out.println("Give a number:");
            sum = sum + Integer.parseInt(scanner.nextLine());
            amount--;
        }

        // Result.
        System.out.println("Sum is: " + sum);

        // Closing the resources.
        scanner.close();

    }
}