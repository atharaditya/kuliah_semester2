package Jobsheet8;

public class Percobaan1 {
    //method void tanpa parameter
    static void cetakHallo (){
        System.out.println("Hallo Semua");
    }
    //method void dengan satu parameter
    static void sayHallo(String nama){
        System.out.println("Hallo "+nama);
    }
    //methode return
    static int luasSegiPanjang(int Panjang, int Lebar){
        int luas = Panjang*Lebar;
        return luas;
    }

     public static void main(String[] args) {
        //panggil di method utama
        //cara memanggil method
        //namaMethod();

        cetakHallo();
        sayHallo("Dian");
        int luas=luasSegiPanjang(4, 4);
        //System.out.println(luasSegiPanjang(3, 4));
        System.out.println(luas);
    }
}