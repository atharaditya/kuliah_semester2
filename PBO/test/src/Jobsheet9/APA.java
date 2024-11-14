package Jobsheet9;

public class APA {
    protected String jabatan;
    protected String nama;
    public APA(String nama, String jabatan ) {
        this.nama = nama;
        this.jabatan = jabatan;
    }
    public void info() {
        System.out.println("Nama Manager: " + nama);
        System.out.println("Jabatan Saat ini " + jabatan);
    }
    public void mengawasi() {
        System.out.println("Sedang Mengawasi Pekerja");
   
    }
    public void toko(){
        System.out.println("APOTEK JAYA ABADI");
    }
}

class Apoteker extends APA {
    private String meracikObat;

     public Apoteker(String nama, String jabatan, String meracikObat) {
        super(nama,jabatan);
 
        this.meracikObat = meracikObat;
}

    public String getMeracikObat() {
        return meracikObat;
    }
    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }
       
     public void tugas1(){
        System.out.println("Sedang meracik obat ");
       } 
}
class TenagaTeknis extends APA {
    private String membantuApoteker;
    public TenagaTeknis(String nama, String jabatan, String membantuApoteker) {
        super(nama,jabatan);
        this.membantuApoteker = membantuApoteker;
 
}

    public String getMembantuApoteker() {
        return membantuApoteker;
    }

    

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }
    public void tugas2(){
        System.out.println("Mengecek Ketersediaan obat");
    }
}
class Kasir extends APA {
    private String melayani;

    
    public Kasir(String nama, String jabatan, String melayani) {
        super(nama,jabatan);
        this.melayani = melayani;
}

    public String getMelayani() {
        return melayani;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }
    public void tugas3(){
        System.out.println("Sedang melayani Konsumen");
    }
}
class Administrasi extends APA {
    private String laporan;
    private String databasesKonsumen;
    
    public Administrasi(String nama, String jabatan, String laporan) {
        super(nama,jabatan);
        this.laporan = laporan ;
}

    public String getLaporan() {
        return laporan;
    }
    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }
    public void tugas4(){
        System.out.println("Sedang Membuat Laporan Keuangan Apotek Jaya abadi");
    }
}
class PetugasGudang extends APA {
    private String menyimpan;    
    public PetugasGudang(String nama, String jabatan, String menyimpan ) {
        super(nama,jabatan);
        this.menyimpan = menyimpan;
}

    public String getMenyimpan() {
        return menyimpan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }
    public void tugas5(){
        System.out.println("Mengatur Gudang obat");
}
}
class mainAPA {
    public static void main(String[] args) {
       APA w = new APA ("Fachri","Manager");
       w.toko();
       w.info();
        w.mengawasi();
         System.out.println("-------------------------------------------------------");
        Apoteker pekerja = new Apoteker("Anggi M.s", "karyawan", "Apoteker");
        System.out.println("Nama : " +pekerja.getNama());
        System.out.println("Jabatan : " +pekerja.getJabatan());
        System.out.println("Pekerjaan: "+pekerja.getMeracikObat());
        pekerja.tugas1();
        System.out.println("-------------------------------------------------------");
       TenagaTeknis c = new TenagaTeknis("Yoga","Karyawan","Assisten apoteker");
        System.out.println("Nama : " +c.getNama());
        System.out.println("Jabatan : " +c.getJabatan());
        System.out.println("Pekerjaan: "+c.getMembantuApoteker());
        c.tugas2();
        System.out.println("-------------------------------------------------------");
       Kasir x = new Kasir("Aziz","karyawan magang","kasir");
        System.out.println("Nama : " +x.getNama());
        System.out.println("Jabatan : " +x.getJabatan());
        System.out.println("Pekerjaan: "+x.getMelayani());
        x.tugas3();
        System.out.println("-------------------------------------------------------");
       Administrasi v = new Administrasi("Fadli","Karyawan","Mengelola Administrasi"); 
       System.out.println("Nama : " +v.getNama());
        System.out.println("Jabatan : " +v.getJabatan());
        System.out.println("Pekerjaan: "+v.getLaporan());
        v.tugas4();
        System.out.println("-------------------------------------------------------");
       PetugasGudang e = new PetugasGudang("Irfan","Karyawan","Petugas Gudang");
       System.out.println("Nama : " +e.getNama());
        System.out.println("Jabatan : " +e.getJabatan());
        System.out.println("Pekerjaan: "+e.getMenyimpan());
        e.tugas5();
        
    }

}