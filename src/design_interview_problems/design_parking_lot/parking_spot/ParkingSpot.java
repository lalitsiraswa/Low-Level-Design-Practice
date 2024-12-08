package design_interview_problems.design_parking_lot.parking_spot;

import design_interview_problems.design_parking_lot.vehicle_type.Vehicle;

public abstract class ParkingSpot {
    private final String parkingSpotId;
    private Boolean isSpotAvailable;
    private Vehicle vehicle;
    private final ParkingSpotType parkingSpotType;

    public ParkingSpot(String parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = null;
        this.isSpotAvailable = true;
    }

    public Boolean isSpotFree() {
        return this.isSpotAvailable;
    }

    public ParkingSpotType getParkingSpotType() {
        return this.parkingSpotType;
    }

    public String getParkingSpotId() {
        return this.parkingSpotId;
    }

    public Vehicle getVehicleDetails() {
        return this.vehicle;
    }

    public void assignVehicleToSpot(Vehicle vehicle) throws Exception {
        if (!this.isSpotAvailable) {
            throw new Exception("No Spots Are Available For " + vehicle.getType() + "!");
        }
        this.vehicle = vehicle;
        this.isSpotAvailable = false;
    }

    public void vacateVehicleFromSpot() {
        this.vehicle = null;
        this.isSpotAvailable = true;
    }
}
