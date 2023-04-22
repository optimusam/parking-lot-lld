package exceptions;


public class TicketNotFoundException extends ParkingLotException {
    public TicketNotFoundException() {
        super("Invalid Ticket. Please give valid ticket.");
    }
}
