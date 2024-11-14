package Jobsheet2;

public class Referensi {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, jenisKelamin, statusMenikah;
        Integer nilai;
        Manusia manusia = new Manusia();
        //inisialisasi variabel
        nama = "Andi"; // nama = new String ("Andi");
        jenisKelamin = "Pria";
        statusMenikah = "Menikah";
        nilai = 10;
        //menampilkan nilai variabel ke layar output
        System.out.println(nama);
        System.out.println(jenisKelamin);
        System.out.println(statusMenikah);
        System.out.println(nilai);

        System.out.println(manusia);
        System.out.println(manusia.NAMA);
        System.out.println(manusia.TINGGI_BADAN);
        System.out.println(manusia.BERAT_BADAN);
        manusia.berjalan();
        manusia.berlari();
        manusia.makan();
        manusia.minum();
    }
}