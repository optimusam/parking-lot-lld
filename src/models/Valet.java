package models;

import exceptions.ParkingLotException;
import exceptions.TicketGenerationFailedException;
import exceptions.TicketNotFoundException;
import strategy.EVParkingStrategy;
import strategy.ParkingStrategy;
import strategy.SUVParkingStrategy;
import strategy.SedanParkingStrategy;

import java.util.HashMap;
import java.util.Map;

public class Valet {

    private static Integer ticketNumber = 1;
    private final static ParkingStrategy evParkingStrategy = new EVParkingStrategy();
    private final static ParkingStrategy suvParkingStrategy = new SUVParkingStrategy();
    private final static ParkingStrategy sedanParkingStrategy = new SedanParkingStrategy();

    private static final Map<Ticket, ParkingSpot> ticketToParkingSpotMap = new HashMap<>();

    public Valet() {

    }

    public Ticket parkCar(ParkingLot parkingLot, Customer customer) {
        try {
            Car car = customer.getCar();
            ParkingStrategy parkingStrategy = findStrategyToPark(car);
            ParkingSpot parkingSpot = parkingStrategy.park(parkingLot, car);
            Ticket ticket = assignTicket(parkingSpot);
            return ticket;
        } catch (ParkingLotException ex) {
            System.out.println("Failed to secure parking spot.");
        }
        return null;
    }

    public void unparkCar(Ticket ticket) throws TicketNotFoundException {
        ParkingSpot parkingSpot = ticketToParkingSpotMap.get(ticket);
        if (parkingSpot == null) throw new TicketNotFoundException();
        parkingSpot.setParkedCar(null);
        ticketToParkingSpotMap.remove(ticket);
    }

    private static ParkingStrategy findStrategyToPark(Car car) {
        switch (car.getType()) {
            case EV -> {
                return evParkingStrategy;
            }
            case SUV -> {
                return suvParkingStrategy;
            }
            case SEDAN -> {
                return sedanParkingStrategy;
            }
            default -> {
                return null;
            }
        }
    }

    private Ticket assignTicket(ParkingSpot parkingSpot) throws TicketGenerationFailedException {
        try {
            Ticket ticket = new Ticket(ticketNumber++);
            ticketToParkingSpotMap.put(ticket, parkingSpot);
            return ticket;
        } catch (Exception ex) {
            throw new TicketGenerationFailedException();
        }
    }
}
