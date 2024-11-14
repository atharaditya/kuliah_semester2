package Jobsheet10;

class Bioskop {
    private String Judul;
    private String Plot;

    public Bioskop (String Judul, String Plot) {
        this.Judul = Judul;
        this.Plot = Plot;
    }

    public String getJudul() {
        return Judul;
    }

    public String getPlot() {
        return Plot;
    }

    public void tampilkan() {
        System.out.println("Judul   : "+Judul);
        System.out.println("Plot    : "+Plot);
    }

    public void pesan() {
        System.out.println("");
    }
}

class Unyil extends Bioskop {
    public Unyil(String Judul, String Plot) {
        super(Judul, Plot);
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
    }

    @Override
    public void pesan() {
        System.out.println("Selamat Menonton Film  Unyil");
    }
}

class AADC extends Bioskop {
    public AADC(String Judul, String Plot) {
        super(Judul, Plot);
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
    }

    @Override
    public void pesan() {
        System.out.println("Selamat Menonton Film  AADC");
    }
}

class KCB extends Bioskop {
    public KCB(String Judul, String Plot) {
        super(Judul, Plot);
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
    }

    @Override
    public void pesan() {
        System.out.println("Selamat Menonton Film  KCB");
    }
}

public class BioskopIndonesia {
    public static void main(String[] args) {
        System.out.println("========================================================================");
        System.out.println("Selamat datang di Bioskop Indonesia");
        System.out.println("========================================================================");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        Unyil unyil = new Unyil("Laptop si Unyil", "Bermain bersama teman-teman");
        unyil.tampilkan();
        unyil.pesan();
        System.out.println("------------------------------------------------------------------------");
        AADC aadc = new AADC("Ada Apa Dengan Cinta", "Kisah Cinta Dua Remaja SMA");
        aadc.tampilkan();
        aadc.pesan();
        System.out.println("------------------------------------------------------------------------");
        KCB kcb = new KCB("Ketika Cinta Bertasbih", "mengisahkan tentang seorang mahasiswa Indonesia");
        kcb.tampilkan();
        kcb.pesan();
        System.out.println("------------------------------------------------------------------------");
    }
}