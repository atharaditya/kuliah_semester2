package Jobsheet5;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka = ");
        int i = input.nextInt();
        System.out.print("masukan angka = ");
        int x = input.nextInt();
        while (i <= x) {
            System.out.println(+i);
            i++;
        }
    }
}