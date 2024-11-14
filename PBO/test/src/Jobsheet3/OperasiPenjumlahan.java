package Jobsheet3;
import java.util.Scanner;

public class OperasiPenjumlahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        int hasil = bilangan1 + bilangan2;

        System.out.println("Hasil penjumlahan: " + hasil);

        scanner.close();
    }
}