package design_interview_problems.design_parking_lot_by_ashish_pratap_singh;

import design_interview_problems.design_parking_lot_by_ashish_pratap_singh.vehicle_type.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<Level> levels;

    public ParkingLot() {
        levels = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                System.out.println("Vehicle Parked Successfully!");
                return true;
            }
        }
        System.out.println("Could Not Park Vehicle!");
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.unParkVehicle(vehicle)) {
                System.out.println("Vehicle UnParked Successfully!");
                return true;
            }
        }
        System.out.println("Could Not UnPark Vehicle!");
        return false;
    }

    public void displayAvailability() {
        for (Level level : levels) {
            level.displayAvailability();
        }
    }
}
