package Jobsheet6;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Perpangkatan");
        System.out.print("Input bilangan yang akan dipangkatkan: ");
        int bilangan = input.nextInt();
        System.out.print("Input pangkat: ");
        int pangkat = input.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.println("Hasil dari " + bilangan + " pangkat " + pangkat + " adalah " + hasil );

        input.close();
    }

    public static int hitungPangkat(int bilangan, int pangkat) {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan;
        }
        return hasil;
    }
}