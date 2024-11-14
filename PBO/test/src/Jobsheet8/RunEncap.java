package Jobsheet8;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setNama("Izar");
        encap.setAge(30);

        System.out.println("Nama "+encap.getnama());
        System.out.println("Usia "+encap.getage());
    }
}