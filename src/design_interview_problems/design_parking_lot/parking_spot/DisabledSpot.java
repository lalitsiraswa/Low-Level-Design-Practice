package design_interview_problems.design_parking_lot.parking_spot;

public class DisabledSpot extends ParkingSpot {
    public DisabledSpot(String parkingSpotId) {
        super(parkingSpotId, ParkingSpotType.DISABLED);
    }
}
