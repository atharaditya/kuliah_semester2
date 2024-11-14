package Jobsheet2;

public class BiodataMahasiswa {
    // Konstanta
  public static final String NAMA = "Atha Nala Isra Raditya";
  public static final String NIM = "3202216006";
  public static final String PRODI = "Teknik Informatika";
  
  // Variabel
  public int semester = 2;
  public String kelas = "Kelas 2";
  public int umur = 28;
  public double ipk = 3.75;
  
  public static void main(String[] args) {
    BiodataMahasiswa mahasiswa = new BiodataMahasiswa();
    System.out.println("Konstanta:");
    System.out.println("Nama:" + mahasiswa.NAMA);
    System.out.println("NIM:" + mahasiswa.NIM);
    System.out.println("Prodi:" + mahasiswa.PRODI);
    System.out.println("\nVariabel:");
    System.out.println("Semester: " + mahasiswa.semester);
    System.out.println("Kelas: " + mahasiswa.kelas);
    System.out.println("Umur: " + mahasiswa.umur);
    System.out.println("IPK: " + mahasiswa.ipk);
  }
}