package Jobsheet1ExchangeSort;

import java.util.Scanner;

public class Atha_ExchangeSort_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        //input jumlah data
        System.out.println("Masukan jumlah data: ");
        n = input.nextInt();

        //input data array
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            a[i] = input.nextInt();
        }

        int temp;

        System.out.println("\nArray sebelum diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        //Exchange sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    //Tukar nilai
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\n\nArray setelah diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
