package Jobsheet5;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("Mencetak angka 1 sampai dengan N menggunakan perulangan for:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Mencetak angka 1 sampai dengan N menggunakan perulangan while:");
        int j = 1;
        while (j <= N) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        System.out.println("Mencetak angka 1 sampai dengan N menggunakan perulangan do while:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= N);
        System.out.println();
    }
}