package Jobsheet3;

import java.util.Scanner;

public class Latihan1_OperasiPenjumlahan {
    public static void main(String[] args) {
        int a, b;
        Scanner jumlah= new Scanner(System.in);
        System.out.println("Masukan nilai a");
        a= jumlah.nextInt();
        System.out.println("Masukan nilai b");
        b= jumlah.nextInt();


        System.out.println("Hasil penjumlahan "+(a+b));
    }
}
