package Day_12;

public class IsRelationship {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle c1 = new Car();
        Vehicle v2 = new Car();

        v1.start();
        c1.start();
        c1.drive();
        v2.drive();
    }
}

class Vehicle {

    public void start() {
        System.out.println("Vehicle Started...");
    }

    public void drive() {
        System.out.println("Vehicle Driving...");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started...");
    }

    @Override
    public void drive() {
        System.out.println("Car Driving...");
    }
}