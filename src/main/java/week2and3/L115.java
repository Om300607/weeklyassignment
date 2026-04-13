package week2and3;

import java.util.Scanner;

public class L115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + n + " = " + fact);
        }

        sc.close();
    }
}

