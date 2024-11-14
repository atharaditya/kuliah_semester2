package Jobsheet4;

import java.util.Scanner;

public class IfBilanganGenap {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah bilangan bulat: ");
        bilangan = input.nextInt();
        if (bilangan % 2 == 0)
            System.out.print("Bilangan yang anda masukkan " + "adalah Bilangan Genap");
        input.close();
    }
}