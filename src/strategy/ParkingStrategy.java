package strategy;

import exceptions.ParkingLotException;
import models.Car;
import models.ParkingLot;
import models.ParkingSpot;

public abstract class ParkingStrategy {
     public abstract ParkingSpot park(ParkingLot parkingLot, Car car) throws ParkingLotException;
}
