package Jobsheet5;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai M: ");
        int M = input.nextInt();

        System.out.print("Masukan nilai N: ");
        int N = input.nextInt();

        System.out.println("Mencetak deret bilangan genap kecuali kelipatan 4 menggunakan perulangan for:");
        for (int i = M; i <= N; i++) {
            if (i % 2 == 0 && i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Mencetak deret bilangan genap kecuali kelipatan 4 menggunakan perulangan while:");
        int x = M;
        while (x <= N) {
            if (x % 2 == 0 && x % 4 != 0) {
                System.out.print(x + " ");
            }
            x++;
        }
        System.out.println();

        System.out.println("Mencetak deret bilangan genap kecuali kelipatan 4 menggunakan perulangan do while:");
        int y = M;

        do {
            if (y % 2 == 0 && y % 4 != 0) {
                System.out.println();
            }
            y++;
        } while (y <= N);
        System.out.println();
    }
}