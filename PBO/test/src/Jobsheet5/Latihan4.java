package Jobsheet5;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("Mencetak deret bilangan ganjil kecuali kelipatan 5 menggunakan perulangan for:");
        for (int i = M; i <= N; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.println("Mencetak deret bilangan ganjil kecuali kelipatan 5 menggunakan perulangan while:");
        int j = M;
        while (j <= N) {
            if (j % 2 != 0 && j % 5 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();
        
        System.out.println("Mencetak deret bilangan ganjil kecuali kelipatan 5 menggunakan perulangan do while:");
        int k = M;
        do {
            if (k % 2 != 0 && k % 5 != 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= N);
        System.out.println();
    }
}