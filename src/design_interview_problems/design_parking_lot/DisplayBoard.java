package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.parking_spot.ParkingSpotType;

public class DisplayBoard {
    public void displayMessage(ParkingSpotType parkingSpotType, long freeSpots) {
        String message = String.valueOf(parkingSpotType) + "Spots Free : " + freeSpots;
        System.out.println(message);
    }
}
