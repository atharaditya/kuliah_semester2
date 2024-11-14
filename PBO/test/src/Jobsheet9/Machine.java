package Jobsheet9;

public class Machine {
    protected String name = "Machine Type 1";

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }
}

class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}

class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();

        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();
        }
}