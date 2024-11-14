package Jobsheet10;

class Lingkaran  {
    private float r;
    private double d;
    private double luas;
    public void hitungLuas(float jariJari) {
        // cara (implementasi)
        r = jariJari;
        luas = Math.PI * r * r;
        System.out.println("Luas lingkaran: " + luas);
    }

    public void hitungLuas(double dimensi) {
        // cara (implementasi)
        d = dimensi;
        luas = (Math.PI * d * d) / 4;
        System.out.println("Luas lingkaran: " + luas);
    }
}

public class PolimorfismeStatis {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.hitungLuas(10f);
        l.hitungLuas(20d);
    }
}