package Jobsheet7;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Integer[] Bilanganbulat = new Integer[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Input bilangan bulat Ke-" + (i+1) + ": ");
            Bilanganbulat[i] = input.nextInt();  
        }

        Arrays.sort(Bilanganbulat);
        System.out.println("Bilangan bulat dari terkecil ke terbesar:  ");
        for (int num : Bilanganbulat) {
            System.out.print(num + " ");
        }

        Arrays.sort(Bilanganbulat,Comparator.reverseOrder());
        System.out.println('\n' + "Bilangan bulat dari terbesar ke terkecil: ");
        for (int num : Bilanganbulat) {
            System.out.print(num + " ");
        }

        input.close();
    }
}