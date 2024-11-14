package Jobsheet5;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int sum = 0;  
        int count = 0;  

        System.out.println("Mencetak deret bilangan bulat positif kecuali kelipatan 3 menggunakan perulangan for:");
        for (int i = M; i <= N; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }
        System.out.println();

        double average = (double) sum / count;
        System.out.println("Nilai rata-rata: " + average);

        System.out.println("Mencetak deret bilangan bulat positif kecuali kelipatan 3 menggunakan perulangan while:");
        int j = M;
        sum = 0;
        count = 0;
        while (j <= N) {
            if (j % 3 != 0) {
                System.out.print(j + " ");
                sum += j;
                count++;
            }
            j++;
        }
        System.out.println();

        average = (double) sum / count;
        System.out.println("Nilai rata-rata: " + average);

        System.out.println("Mencetak deret bilangan bulat positif kecuali kelipatan 3 menggunakan perulangan do while:");
        int k = M;
        sum = 0;
        count = 0;
        do {
            if (k % 3 != 0) {
                System.out.print(k + " ");
                sum += k;
                count++;
            }
            k++;
        } while (k <= N);
        System.out.println();

        average = (double) sum / count;
        System.out.println("Nilai rata-rata: " + average);
    }
}