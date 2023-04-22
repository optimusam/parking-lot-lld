package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    public List<ParkingSpot> parkingSpots;
    public ParkingLot() {
        parkingSpots = new ArrayList<>();
    }
    void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
    }

    @Override
    public String toString() {
        String res = "";
        for (ParkingSpot parkingSpot: parkingSpots) {
            res += parkingSpot.toString() + " , ";
        }
        return res;
    }
}
