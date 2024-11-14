package Jobsheet7;
import java.util.Scanner;
public class DaftarNamaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Input Nama ke-" + (i+1) + ": ");
            nama[i] = input.next();
        }
        System.out.println("Daftar Nama Mahasiswa:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke-" + (i+1) + ": " + nama[i]);
        }
        input.close();
    }
}