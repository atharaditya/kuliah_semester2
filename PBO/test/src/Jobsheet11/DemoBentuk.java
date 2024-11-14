package Jobsheet11;
public class DemoBentuk {
    public static void main(String[] args) {
        Bentuk segitiga = new Segitiga(0.4f,0.5f); 
        Bentuk lingkaran = new Lingkaran(10); 
        
        System.out.println("Luas Segitiga: " + segitiga.getArea()); 
        System.out.println("Luas Lingkaran: " + lingkaran.getArea()); 
    
    }
}