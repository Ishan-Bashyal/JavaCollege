class Vehicle1 {
    private String engineNo;

    Vehicle1(String engineNo) {
        this.engineNo = engineNo;
    }

    void startEngine() {
        System.out.println("Engine started");
    }
    void stopEngine()  {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle1 {
    private String brand;

    Car(String engineNo, String brand) {
        super(engineNo);
        this.brand = brand;
    }

    void drive() {
        System.out.println("Driving a car");
    }
}

class Motorcycle extends Vehicle1 {
    private String type;

    Motorcycle(String engineNo, String type) {
        super(engineNo);
        this.type = type;
    }

    void ride() {
        System.out.println("Riding a motorcycle.");
    }

    public static void main(String[] args) {
        Car car = new Car("001", "Toyota");
        car.startEngine();
        car.drive();
        car.stopEngine();

        Motorcycle bike = new Motorcycle("ENG987", "Sport");
        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}
