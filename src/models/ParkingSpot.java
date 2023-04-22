package models;

public class ParkingSpot {
    private Integer id;
    private ParkingSpotType type;
    private Car parkedCar;

    public ParkingSpot(Integer id, ParkingSpotType type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", type=" + type +
                ", parkedCar=" + parkedCar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParkingSpot that = (ParkingSpot) o;

        if (!id.equals(that.id)) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }
}
