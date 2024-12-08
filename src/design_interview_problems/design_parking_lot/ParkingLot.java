package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.parking_spot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> parkingFloors;
    private List<EntryPanel> entryPanels;
    private List<ExitPanel> exitPanels;

    public ParkingLot() {
        this.parkingFloors = new ArrayList<ParkingFloor>();
        this.entryPanels = new ArrayList<EntryPanel>();
        this.exitPanels = new ArrayList<ExitPanel>();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public ParkingSpot vacateParkingSpot(String parkingSpotId) {
        for (ParkingFloor parkingFloor : parkingFloors) {
            for (List<ParkingSpot> parkingSpots : parkingFloor.getListOfParkingSpots().values()) {
                for (ParkingSpot spot : parkingSpots) {
                    if (spot.getParkingSpotId().equals(parkingSpotId)) {
                        spot.vacateVehicleFromSpot();
                        return spot;
                    }
                }
            }
        }
        return null;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<EntryPanel> getEntryPanels() {
        return entryPanels;
    }

    public List<ExitPanel> getExitPanels() {
        return exitPanels;
    }
}
