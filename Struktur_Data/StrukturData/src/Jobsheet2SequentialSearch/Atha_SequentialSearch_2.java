package Jobsheet2SequentialSearch;

import java.util.Scanner;

public class Atha_SequentialSearch_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = input.nextInt();

        int[] A = new int[n];

        System.out.println("Masukkan elemen array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            A[i] = input.nextInt();
        }

        int target = 5;
        boolean found = false;
        int index = -1;

        // Pencarian sekuensial
        for (int i = 0; i < A.length; i++) {
            if (A[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        // Menampilkan hasil
        if (found) {
            System.out.println("Angka " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
    }
}