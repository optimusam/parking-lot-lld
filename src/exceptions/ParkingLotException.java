package exceptions;

public class ParkingLotException extends Exception {
    public ParkingLotException(String message) {
        super("Please try after sometime. " + message);
    }
}
