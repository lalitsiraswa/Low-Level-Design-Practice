package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.parking_spot.ParkingSpotType;

import java.util.HashMap;
import java.util.Map;

public class HourlyCost {
    private Map<ParkingSpotType, Integer> hourlyCosts = new HashMap<ParkingSpotType, Integer>();

    public HourlyCost() {
        this.hourlyCosts.put(ParkingSpotType.COMPACT, 25);
        this.hourlyCosts.put(ParkingSpotType.DISABLED, 15);
        this.hourlyCosts.put(ParkingSpotType.ELECTRIC_CAR, 35);
        this.hourlyCosts.put(ParkingSpotType.LARGE, 45);
        this.hourlyCosts.put(ParkingSpotType.MOTORCYCLE, 15);
    }

    public Integer getCost(ParkingSpotType parkingSpotType) throws Exception {
        if (this.hourlyCosts.containsKey(parkingSpotType)) {
            return this.hourlyCosts.get(parkingSpotType);
        } else {
            throw new Exception("Hourly Cost Is Not Associated With " + parkingSpotType + " Type!");
        }
    }
}
