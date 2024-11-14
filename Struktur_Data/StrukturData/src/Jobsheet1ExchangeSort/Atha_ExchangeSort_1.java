package Jobsheet1ExchangeSort;

public class Atha_ExchangeSort_1 {
    public static void main(String[] args) {
        int[] a = {12, 15, 7, 10, 25, 2, 17, 25, 5, 20};
        int temp;
        
        System.out.println("Array sebelum diurutkan:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        //Exchange sorting
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    //Tukar nilai
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("\n\nArray setelah diurutkan:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}