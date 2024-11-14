package Jobsheet4;
import java.util.Scanner;

public class IfBilanganAbsolut {
        public static void main(String[] args) {
            float bilangan;
            Scanner input = new Scanner(System.in);
            System.out.print("Input sebuah bilangan real: ");
            bilangan = input.nextFloat();
            if (bilangan < 0)
            bilangan = Math.abs(bilangan);
            System.out.println("Nilai absolut: " + bilangan);
            input.close(); 
    }
}