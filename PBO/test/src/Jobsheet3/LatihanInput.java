package Jobsheet3;

import java.util.Scanner;

public class LatihanInput {
    public static void main(String[] args) {
        String nama, prodi;
        Scanner baca= new Scanner(System.in);
        System.out.println("Masukan nama");
        System.out.println(("Masukan prodi"));
        nama= baca.nextLine();
        prodi= baca.nextLine();

        System.out.println("Jadi nama kamu "+nama);
        System.out.println("Jadi prodi kamu "+prodi);
    }
}
