package Jobsheet6;

import java.util.Random;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Random random = new Random();
        int angkaAcak = random.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);

        System.out.print("PROGRAM ");
        System.out.println("TEBAK ANGKA (1 S.D. 10)\n");

        while (true) {
            System.out.print("Tebakan Anda: ");
            int tebakan = input.nextInt();

            if (tebakan == angkaAcak) {
                System.out.println("\nTebakan Anda Benar");
                break;
            } else {
                System.out.println();
            }
        }

        input.close();
    }
}