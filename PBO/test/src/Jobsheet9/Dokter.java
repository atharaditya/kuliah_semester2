package Jobsheet9;

public class Dokter {
    protected String nama;
    protected String spesialisasi;

    public Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public void info() {
        System.out.println("Nama dokter: " + nama);
        System.out.println("Spesialisasi " + spesialisasi);
    }

    public void periksaPasien() {
        System.out.println("Melakukan pemeriksaan pasien.");
    }
}

class DokterGigi extends Dokter {
    private int pengalaman;

    public DokterGigi(String nama, String spesialisasi, int pengalaman) {
        super(nama, spesialisasi);
        this.pengalaman = pengalaman;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Pengalaman: " + pengalaman + " tahun");
    }

    public void cabutGigi() {
        System.out.println("Mencabut gigi pasien.");
    }
}

class DokterBedah extends Dokter {
    private String rumahSakit;

    public DokterBedah(String nama, String spesialisasi, String rumahSakit) {
        super(nama, spesialisasi);
        this.rumahSakit = rumahSakit;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Rumah sakit " + rumahSakit);
    }

    public void melakukanOperasi() {
        System.out.println("Melakukan operasi pada pasien");
    }
}

class mainDokter {
    public static void main(String[] args) {
        DokterGigi dokterGigi = new DokterGigi("Dr. Rudiansyah", "Dokter gigi", 13);
        dokterGigi.info();
        dokterGigi.periksaPasien();
        dokterGigi.cabutGigi();
        System.out.println();

        DokterBedah dokterBedah = new DokterBedah("Dr. Febri", "Dokter bedah", "Bhayangkara");
        dokterBedah.info();
        dokterBedah.periksaPasien();
        dokterBedah.melakukanOperasi();
    }
}