package week2and3part2;

import java.util.Scanner;

public class L26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();

        // Youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest: Amar");
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        // Tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest: Amar");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }
    }
}

