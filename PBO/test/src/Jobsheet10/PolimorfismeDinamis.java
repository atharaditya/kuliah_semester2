package Jobsheet10;

class Hewan {
    public void bersuara() {
        // cara (implementasi)
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
        public void bersuara() {
            // cara implementasi
            System.out.println("Miau");
        }
    }

class Singa extends Hewan {
        public void bersuara() {
            // cara (implementasi)
            System.out.println("Aum");
        }
    }

public class PolimorfismeDinamis {
        public static void main(String[] args) {
            Hewan hewan[] = new Hewan[5];
            hewan[0] = new Kucing();
            hewan[1] = new Singa();
            hewan[2] = new Kucing();
            hewan[3] = new Singa();
            hewan[4] = new Singa();
            for (int i = 0; i < hewan.length; i++) {
                hewan[i].bersuara();
            }
        }
    }