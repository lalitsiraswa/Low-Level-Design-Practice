package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.parking_spot.ParkingSpot;
import design_interview_problems.design_parking_lot.vehicle_type.Vehicle;

public class EntryPanel {
    private String entryPanelId;

    public EntryPanel(String entryPanelId) {
        this.entryPanelId = entryPanelId;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) throws Exception {
        ParkingFloor parkingFloor = ParkingLot.getInstance().getParkingFloors()
                .stream()
                .filter(floor -> floor.canPark(vehicle))
                .findFirst()
                .orElse(null);
        if (parkingFloor == null) {
            throw new Exception("Parking Is Unsupported For This " + vehicle.getType() + "Type!");
        }

        ParkingSpot spot = parkingFloor.getAvailableSpot(vehicle);
        if (spot == null) {
            throw new Exception("No Spots Are Available For " + vehicle.getType() + " type!");
        }

        ParkingTicket ticket = this.generateParkingTicket(vehicle, parkingFloor.getParkingFloorId(), spot.getParkingSpotId());
        spot.assignVehicleToSpot(vehicle);
        return ticket;
    }

    public ParkingTicket generateParkingTicket(Vehicle vehicle, String parkingFloorId, String parkingSpotId) {
        return new ParkingTicket(vehicle.getType(), vehicle.getRegistrationNumber(), parkingFloorId, parkingSpotId).setStartTime();
    }
}
