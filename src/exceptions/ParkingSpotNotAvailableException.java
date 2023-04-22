package exceptions;

public class ParkingSpotNotAvailableException extends ParkingLotException {

    public ParkingSpotNotAvailableException() {
        super("Parking Spot Not Available");
    }
}
