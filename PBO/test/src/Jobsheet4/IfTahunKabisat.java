package Jobsheet4;
import java.util.Scanner;;

public class IfTahunKabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner input = new Scanner(System.in);
        System.out.print("Input tahun: ");
        tahun = input.nextInt();
    if ((tahun % 400 == 0) || ((tahun % 4 == 0) &&
        (tahun % 100 != 0)))
        System.out.println("Tahun Kabisat");

     else
     System.out.println("Bukan Tahun Kabisat");
     input.close();
    }
}