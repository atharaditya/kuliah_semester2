package Jobsheet9;

class Manusia {
    String nama= "Atha";
}

class Dosen extends Manusia {
    String nama= "Budi";
    void cetakDosen() {
        System.out.println("method pada dosen dicetak");
        System.out.println("Nama "+nama);
        System.out.println("Nama "+super.nama);
    }
}

class Mahasiswa extends Manusia {
    void cetakMahasiswa() {
        System.out.println("method pada mahasiswa");
        
    }
}

public class MainManusia {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        mhs.cetakMahasiswa();
        dsn.cetakDosen();
    }
}