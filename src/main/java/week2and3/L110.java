package week2and3;

import java.util.Scanner;

public class L110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value;

        while ((value = sc.nextDouble()) != 0) {
            total += value;
        }
        System.out.println("Total value: " + total);
    }
}

