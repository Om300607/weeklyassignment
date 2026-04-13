package week2and3;

import java.util.Scanner;

public class L111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();

            if (num <= 0) {
                break; // exit loop
            }
            sum += num;
        }

        System.out.println("Final Sum = " + sum);
        sc.close();
    }
}

