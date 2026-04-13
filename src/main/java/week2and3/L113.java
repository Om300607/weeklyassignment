package week2and3;

import java.util.Scanner;

public class L113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (>0).");
        } else {
            // Compute using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Compute using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop = " + sumLoop);
            System.out.println("Sum using formula  = " + sumFormula);

            // Compare
            if (sumLoop == sumFormula) {
                System.out.println("✅ Both results match!");
            } else {
                System.out.println("❌ Results do not match!");
            }
        }

        sc.close();
    }
}

