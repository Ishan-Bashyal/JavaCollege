public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable = true;

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setRentalPricePerDay(double price) {
        rentalPricePerDay = price;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void rentCar() {
        if (isAvailable) isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
