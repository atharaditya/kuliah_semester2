package Jobsheet7;

public class Matriks2x2 {
    public static void main(String[] args) {
        int[][] matriks2x2 = new int[2][2];
        //mengisi elemen matriks
        matriks2x2[0][0] = 3;
        matriks2x2[0][1] = 2;
        matriks2x2[1][0] = 0;
        matriks2x2[1][1] = 4;
        //menampilkan atau mencetak elemen matriks ke layar console
        System.out.println("MATRIKS 2x2");
        System.out.print("| " + matriks2x2[0][0]);
        System.out.println(" " + matriks2x2[0][1] + " |");
        System.out.print("| " + matriks2x2[1][0]);
        System.out.print(" " + matriks2x2[1][1] + " |");
    }
}