package Jobsheet7;

public class Array1 {
    public static void main(String[] args) {
        int[] arrayAngka={2,5,8,7};
        System.out.println(arrayAngka[0]);
        System.out.println(arrayAngka[1]);
        System.out.println(arrayAngka[2]);
        System.out.println(arrayAngka[3]);

        for (int i = 0; i < 4; i++) {
            System.out.println("Index Ke " +(i) + " Angkanya " + arrayAngka[i]);
        }
        
        for (int aA : arrayAngka) {
            System.out.println(aA);
        }
    }
}