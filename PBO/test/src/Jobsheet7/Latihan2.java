package Jobsheet7;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        int[][] matriks1 = new int [2][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan matriks pertama");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "]["+ j + "]: ");
                matriks1[i][j] = input.nextInt();
            }
        }

        int[][] matriks2 = new int [2][3];
        System.out.println("Masukan matriks kedua");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "]["+ j + "]: ");
                matriks2[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks pertama yang diinputkan:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + matriks1[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("Matriks kedua yang diinputkan:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + matriks2[i][j] + " |");
            }
            System.out.println();
        }

        int[][] sumMatrix = new int[2][3];
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + sumMatrix[i][j] + " |");
            }
            System.out.println();
        }

        input.close();
    }
}