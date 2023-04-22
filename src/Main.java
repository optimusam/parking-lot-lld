import exceptions.ParkingLotException;
import exceptions.TicketNotFoundException;
import models.*;
import strategy.ParkingStrategy;

import java.util.Map;

public class Main {
    public static void main(String[] args)  {
        // creating parking lot
        ParkingLot parkingLot = new ParkingLot();
        ParkingSpot evSpot1 = new ParkingSpot(1, ParkingSpotType.EV);
        ParkingSpot evSpot2 = new ParkingSpot(2, ParkingSpotType.EV);
        ParkingSpot evSpot3 = new ParkingSpot(3, ParkingSpotType.EV);
        ParkingSpot suvSpot1 = new ParkingSpot(1, ParkingSpotType.SUV);
        ParkingSpot suvSpot2 = new ParkingSpot(2, ParkingSpotType.SUV);
        ParkingSpot suvSpot3 = new ParkingSpot(3, ParkingSpotType.SUV);
        ParkingSpot regularSpot1 = new ParkingSpot(1, ParkingSpotType.REGULAR);
        ParkingSpot regularSpot2 = new ParkingSpot(2, ParkingSpotType.REGULAR);
        ParkingSpot regularSpot3 = new ParkingSpot(3, ParkingSpotType.REGULAR);

        parkingLot.parkingSpots.add(evSpot1);
        parkingLot.parkingSpots.add(regularSpot1);
//        parkingLot.parkingSpots.add(suvSpot1);

        parkingLot.parkingSpots.add(evSpot2);
        parkingLot.parkingSpots.add(regularSpot2);
//        parkingLot.parkingSpots.add(suvSpot2);

        parkingLot.parkingSpots.add(evSpot3);
        parkingLot.parkingSpots.add(regularSpot3);
//        parkingLot.parkingSpots.add(suvSpot3);


        // creating cars
        Car ev1 = new Car("EV1", CarType.EV);
        Car ev2 = new Car("EV2", CarType.EV);
        Car ev3 = new Car("EV3", CarType.EV);

        Car suv1 = new Car("SUV1", CarType.SUV);
        Car suv2 = new Car("SUV2", CarType.SUV);
        Car suv3 = new Car("SUV3", CarType.SUV);

        Car sedan1 = new Car("SEDAN1", CarType.SEDAN);
        Car sedan2 = new Car("SEDAN2", CarType.SEDAN);
        Car sedan3 = new Car("SEDAN3", CarType.SEDAN);

        // creating customers
        Customer customerWithEV1 = new Customer(1, ev1);
        Customer customerWithSUV1 = new Customer(2, suv1);
        Customer customerWithSedan1 = new Customer(3, sedan1);

        // creating valet
        System.out.println(parkingLot);

        Valet valet = new Valet();

        Ticket ticketSedan1 = valet.parkCar(parkingLot, customerWithSedan1);
        Ticket ticketSUV1 = valet.parkCar(parkingLot, customerWithSUV1);
        Ticket ticketEV1 = valet.parkCar(parkingLot, customerWithEV1);

        System.out.println(parkingLot);

        try {
            valet.unparkCar(ticketSUV1);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(parkingLot);

    }
}