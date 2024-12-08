package design_interview_problems.design_parking_lot.parking_spot;

public class CarSpot extends ParkingSpot {
    public CarSpot(String parkingSpotId) {
        super(parkingSpotId, ParkingSpotType.COMPACT);
    }
}
