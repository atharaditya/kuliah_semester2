package Jobsheet5;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = input.nextInt();

        int faktorialFor = 1;
        for (int i = 1; i <= N; i++) {
            faktorialFor *= i;
        }

        int faktorialWhile = 1;
        int j = 1;
        while (j <= N) {
            faktorialWhile *= j;
            j++;
        }

        int faktorialDoWhile = 1;
        int k = 1;
        do {
            faktorialDoWhile *= k;
            k++;
        } while (k <= N);

        System.out.println("Hasil faktorial dari " + N + " menggunakan perulangan for: " + faktorialFor);
        System.out.println("Hasil faktorial dari " + N + " menggunakan perulangan while: " + faktorialWhile);
        System.out.println("Hasil faktorial dari " + N + " menggunakan perulangan do while: " + faktorialDoWhile);
    }
}