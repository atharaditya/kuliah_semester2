package Jobsheet2SequentialSearch;

public class Atha_SequentialSearch_1 {
    public static void main(String[] args) {
        int[] A = {12, 15, 7, 10, 25, 2, 17, 25, 5, 20};
        int target = 5;
        boolean found = false;
        int index = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Angka " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
    }
}