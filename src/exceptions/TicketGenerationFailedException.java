package exceptions;

public class TicketGenerationFailedException extends ParkingLotException {
    public TicketGenerationFailedException() {
        super("Could Not Generate Ticket.");
    }
}
