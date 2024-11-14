package Abstrak;

abstract class BangunDatar {
abstract void cetak();
}

class Segitiga extends BangunDatar {
    void cetak() {
        System.out.println("ini segitiga");
    }
}

class Segiempat extends BangunDatar {
    void cetak() {
        System.out.println("ini segiempat");
    }
}

public class BangunDatarApp {
    public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga();
        segitiga.cetak();

        BangunDatar segiempat = new Segiempat();
        segiempat.cetak();
    }
}