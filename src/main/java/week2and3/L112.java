package week2and3;

import java.util.Scanner;

public class L112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (>0).");
        } else {
            // Compute using while loop
            int i = 1, sumLoop = 0;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            // Compute using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop = " + sumLoop);
            System.out.println("Sum using formula    = " + sumFormula);

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
