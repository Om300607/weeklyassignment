package week2and3part2;

import java.util.Scanner;

public class L214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input values
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize result and counter
        int result = 1;
        int counter = 0;

        // Loop until counter equals power
        while (counter < power) {
            result = result * number; // multiply result by number
            counter++;                // increment counter
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}

