package Jobsheet4;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Komentar Nilai Huruf");
        System.out.print("Input Nilai Huruf Anda: ");
        String nilaiHuruf = input.nextLine();

        switch (nilaiHuruf) {
            case "A":
                System.out.println("Istimewa");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Tidak Lulus");
                break;
            default:
                System.out.println("Nilai huruf tidak dikenal");
        }
    }
}