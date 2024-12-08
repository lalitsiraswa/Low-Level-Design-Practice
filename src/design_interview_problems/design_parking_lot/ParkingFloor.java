package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.parking_spot.ParkingSpot;
import design_interview_problems.design_parking_lot.parking_spot.ParkingSpotType;
import design_interview_problems.design_parking_lot.vehicle_type.Vehicle;
import design_interview_problems.design_parking_lot.vehicle_type.VehicleType;

import java.util.*;
import java.util.stream.Collectors;

public class ParkingFloor {
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpots = new HashMap<ParkingSpotType, List<ParkingSpot>>();
    private String parkingFloorId;
    private DisplayBoard displayBoard;

    public ParkingFloor(String parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
        this.parkingSpots.put(ParkingSpotType.COMPACT, new ArrayList<ParkingSpot>());
        this.parkingSpots.put(ParkingSpotType.MOTORCYCLE, new ArrayList<ParkingSpot>());
        this.parkingSpots.put(ParkingSpotType.LARGE, new ArrayList<ParkingSpot>());
        this.parkingSpots.put(ParkingSpotType.ELECTRIC_CAR, new ArrayList<ParkingSpot>());
        this.displayBoard = new DisplayBoard();
    }

    public String getParkingFloorId() {
        return this.parkingFloorId;
    }

    public Map<ParkingSpotType, List<ParkingSpot>> getListOfParkingSpots() {
        return this.parkingSpots;
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle) {
        return this.parkingSpots.get(this.getSpotTypeForVehicle(vehicle.getType()))
                .stream()
                .filter(ParkingSpot::isSpotFree)
                .findFirst()
                .orElse(null);
    }

    public ParkingSpotType getSpotTypeForVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case VehicleType.CAR:
                return ParkingSpotType.COMPACT;
            case VehicleType.MOTORCYCLE:
                return ParkingSpotType.MOTORCYCLE;
            default:
                return ParkingSpotType.LARGE;
        }
    }

    public void showDisplayBoard() {
        for (ParkingSpotType parkingSpotType : this.parkingSpots.keySet()) {
            // Get the list of free spots using streams
            long freeSpotCount = this.parkingSpots.getOrDefault(parkingSpotType, Collections.emptyList())
                    .stream()
                    .filter(ParkingSpot::isSpotFree)
                    .count();
            this.displayBoard.displayMessage(parkingSpotType, freeSpotCount);
        }
    }

    public List<ParkingSpot> getInUseSpotId(VehicleType vehicleType) {
        ParkingSpotType spotType = this.getSpotTypeForVehicle(vehicleType);
        // Retrieve the list of occupied spots
        return this.parkingSpots.getOrDefault(spotType, Collections.emptyList())
                .stream()
                .filter(parkingSpot -> !parkingSpot.isSpotFree())
                .collect(Collectors.toList());
    }

    public Boolean canPark(Vehicle vehicle) {
        ParkingSpotType spotType = this.getSpotTypeForVehicle(vehicle.getType());
        // Check if the parking spot type exists and has available spots
        List<ParkingSpot> spots = this.parkingSpots.getOrDefault(spotType, Collections.emptyList());
        return spots != null && !spots.isEmpty();
    }
}
