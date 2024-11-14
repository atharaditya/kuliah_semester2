package Jobsheet3;
public class OperatorKondisional {
    public static void main(String[] args) {
        int x, y, z;
        String hasil;
        x = 3; y = 3; z = 3;
        hasil = "Belum diketahui";
        System.out.println("Nilai awal");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("Hasil = " + hasil);
        System.out.println("Operator Kondisional");
        System.out.println("Contoh 1:");
        System.out.println("hasil = (x==y) ? \"Benar\" : \"salah\"");
        hasil = (x==y) ? "Benar" : "Salah";
        System.out.println("Nilai variabel hasil = " + hasil);
        System.out.println("Contoh 2;");
        System.out.println("hasil = (x==z) ? \"Benar\" : \"Salah\"");
        hasil = (x==z) ? "Benar" : "Salah";
        System.out.println("Hasil variabel hasil = " + hasil);
    }
}