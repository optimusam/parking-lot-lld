package models;

public class Car {
    private final String licensePlate;
    private final CarType type;

    public Car(String licensePlate, CarType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public CarType getType() {
        return type;
    }
}
