package Jobsheet6;

import java.util.Random;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("PROGRAM ");
        System.out.println("TEBAK ANGKA\n");

        System.out.print("Masukan nilai maksimal: ");
        int maks = input.nextInt();

        Random random = new Random();
        int angkaAcak = random.nextInt(maks) + 1;

        while (true) {
            System.out.print("Tebakan Anda: ");
            int tebakan = input.nextInt();

            if (tebakan == angkaAcak) {
                System.out.print("Tebakan Anda Benar");
                break;
            } else {
                System.out.println("Maaf Tebakan Anda Salah. Silahkan Coba Lagi!\n");
            }
        }

        input.close();
    }
}
