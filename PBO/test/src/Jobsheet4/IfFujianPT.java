package Jobsheet4;
import java.util.Scanner;

public class IfFujianPT {
    public static void main(String[] args) {
        float nilaiTeori, nilaiPraktek, nilaiGabungan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Nilai Teori: ");
        nilaiTeori = input.nextFloat();
        System.out.print("Input Nilai Praktek: ");
        nilaiPraktek = input.nextFloat();
        nilaiGabungan = nilaiTeori + nilaiPraktek;
        if (nilaiGabungan >= 60)
            System.out.println("Selamat, Anda dinyatakan Lulus");
        else
            System.out.println("Maaf, Anda dinyatakan Tidak Lulus");
        input.close();
    }
}
