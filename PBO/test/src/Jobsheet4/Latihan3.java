package Jobsheet4;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Program Perhitungan Gaji Total Pegawai\nInput Golongan Pegawai Anda (1 s.d. 5): ");
        int golongan = input.nextInt();

        double gaji_pokok;
        double tunjangan_jabatan;

        switch (golongan) {
            case 1:
                gaji_pokok = 1000000;
                tunjangan_jabatan = 0.05 * gaji_pokok;
                break;
            case 2:
                gaji_pokok = 1500000;
                tunjangan_jabatan = 0.1 * gaji_pokok;
                break;
            case 3:
                gaji_pokok = 2000000;
                tunjangan_jabatan = 0.1 * gaji_pokok;
                break;
            case 4:
                gaji_pokok = 2500000;
                tunjangan_jabatan = 0.15 * gaji_pokok;
                break;
            case 5:
                gaji_pokok = 3000000;
                tunjangan_jabatan = 0.2 * gaji_pokok;
                break;
            default:
                System.out.println("Golongan pegawai tidak valid.");
                return;
        }

        double gaji_total = gaji_pokok + tunjangan_jabatan;
        System.out.println("Gaji total anda sebesar Rp. " + gaji_total);
    }
}