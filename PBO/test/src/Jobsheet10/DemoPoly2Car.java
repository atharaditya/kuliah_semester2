package Jobsheet10;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car (int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinder() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car --> Start Engine()";
    }

    public String accelerate() {
        return "Car --> accelerate()";
    }

    public String brake() {
        return "Car --> Brake()";
    }
}

class Mitshibishi extends Car {
    public Mitshibishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubushi --> Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Mitshubishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshubishi --> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {

        super(cylinders, name);
    }

    @Override
    public String startEngine() {

        return "Ford --> Start Engine()";
    }

    @Override
    public String accelerate() {

        return "Ford --> accelerate()";
    }

    @Override
    public String brake() {

        return "Ford --> brake()";
    }
}

public class DemoPoly2Car {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitshibishi mitsu = new Mitshibishi(6, "Mitshubishi");
        System.out.println(mitsu.startEngine());
        System.out.println(mitsu.accelerate());
        System.out.println(mitsu.brake());

        Ford ford = new Ford(6, "Ford");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}