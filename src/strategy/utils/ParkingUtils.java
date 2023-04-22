package strategy.utils;

import models.ParkingSpot;
import models.ParkingSpotType;

import java.util.List;

public class ParkingUtils {
    public static ParkingSpot findRegularParkingSpot(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getType() == ParkingSpotType.REGULAR && parkingSpot.getParkedCar() == null) {
                return parkingSpot;
            }
        }
        return null;
    }

    public static ParkingSpot findSUVParkingSpot(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getType() == ParkingSpotType.SUV && parkingSpot.getParkedCar() == null) {
                return parkingSpot;
            }
        }
        return null;
    }

    public static ParkingSpot findEVParkingSpot(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getType() == ParkingSpotType.EV && parkingSpot.getParkedCar() == null) {
                return parkingSpot;
            }
        }
        return null;
    }
}