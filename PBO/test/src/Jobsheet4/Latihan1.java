package Jobsheet4;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Program Penentuan Pajak");
       System.out.print("Input Penghasilan Perbulan Anda: ");
       double Penghasilan = input.nextDouble();

       if (Penghasilan < 1000000) {
        System.out.println("Anda tidak wajib membayar pajak");
       } else {
            double pkp = Penghasilan - 1000000;
            double pajak = pkp * 0.1;
            System.out.println("Anda wajib membayar pajak sebesar Rp. " + pajak);
            
       }
    }
}