package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.parking_spot.ParkingSpot;
import design_interview_problems.design_parking_lot.parking_spot.ParkingSpotType;

import java.util.Date;

public class ExitPanel {
    private String exitPanelId;

    public ExitPanel(String exitPanelId) {
        this.exitPanelId = exitPanelId;
    }

    public String getExitPanelId() {
        return exitPanelId;
    }

    public ParkingTicket checkout(ParkingTicket parkingTicket) throws Exception {
        String parkingSpotId = parkingTicket.getParkingSpotId();
        int totalDurationInHours = this.calculateDurationInHours(parkingTicket);
        ParkingSpot vacatedSpot = ParkingLot.getInstance().vacateParkingSpot(parkingSpotId);
        if (vacatedSpot == null) {
            throw new Exception("Unable To Find The Parking Spot For The Given ID");
        }
        int totalAmount = this.calculatePrice(vacatedSpot.getParkingSpotType(), totalDurationInHours);
        parkingTicket.setAmount(totalAmount);
        return parkingTicket;
    }

    private Integer calculatePrice(ParkingSpotType parkingSpotType, Integer duration) throws Exception {
        Integer cost = new HourlyCost().getCost(parkingSpotType);
        return duration.equals(0) ? 1 * cost : duration * cost;
    }

    private int calculateDurationInHours(ParkingTicket parkingTicket) {
        Date endTime = parkingTicket.setEndTime().getEndTime();
        return parkingTicket.getStartTime().getHours() - endTime.getHours();
    }
}
