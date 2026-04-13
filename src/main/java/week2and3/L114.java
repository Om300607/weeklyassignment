package week2and3;

import java.util.Scanner;

public class L114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int fact = 1;
            int i = 1;

            while (i <= n) {
                fact *= i;
                i++;
            }

            System.out.println("Factorial of " + n + " = " + fact);
        }

        sc.close();
    }
}
