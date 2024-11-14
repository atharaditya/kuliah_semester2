package Jobsheet12;

public class BagiNolLagi {
    public static void main(String[] args) {
        System.out.println("Sebelum pembagian");
        try {
            System.out.println(2 / 0);
        } catch (RuntimeException r) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t) {
            System.out.println("Throwable");
        }
        System.out.println("Sesudah pembagian");
    }
}