package Jobsheet6;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.print("Input bilangan yang akan dipangkatkan: ");
            int bilangan = input.nextInt();
            System.out.print("Input pangkat: ");
            int pangkat = input.nextInt();

            int hasil = hitungPangkat(bilangan, pangkat);

            System.out.println("Hasil dari " + bilangan + " pangkat " + pangkat + " adalah " + hasil );

            System.out.print("Ingin Coba Lagi (Y/T)? ");
            char pilihan = input.next().charAt(0);

            if (pilihan == 'T' || pilihan == 't') {
                ulang = false;
            }
        }

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