package strategy;

import exceptions.ParkingLotException;
import exceptions.ParkingSpotNotAvailableException;
import models.Car;
import models.ParkingLot;
import models.ParkingSpot;
import strategy.utils.ParkingUtils;

import java.util.List;

public class EVParkingStrategy extends ParkingStrategy {
    @Override
    public ParkingSpot park(ParkingLot parkingLot, Car car) throws ParkingLotException {
        List<ParkingSpot> parkingSpots = parkingLot.parkingSpots;
        ParkingSpot parkingSpotAvailable = ParkingUtils.findEVParkingSpot(parkingSpots);
        if (parkingSpotAvailable == null) parkingSpotAvailable = ParkingUtils.findSUVParkingSpot(parkingSpots);
        if (parkingSpotAvailable == null) parkingSpotAvailable = ParkingUtils.findRegularParkingSpot(parkingSpots);
        if (parkingSpotAvailable == null) throw new ParkingSpotNotAvailableException();
        parkingSpotAvailable.setParkedCar(car);
        return parkingSpotAvailable;
    }
}
