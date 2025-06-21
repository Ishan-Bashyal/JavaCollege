abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) {
        return days * 50;
    }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) {
        return days * 30;
    }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) {
        return days * 10;
    }
}

public class Hw3 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle moto = new Motorcycle();
        Bicycle bike = new Bicycle();

        System.out.println("Car Rent: " + car.calculateRent(3));
        System.out.println("Motorcycle Rent: " + moto.calculateRent(3));
        System.out.println("Bicycle Rent: " + bike.calculateRent(3));
    }
}
