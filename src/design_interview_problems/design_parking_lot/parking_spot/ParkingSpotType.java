package design_interview_problems.design_parking_lot.parking_spot;

public enum ParkingSpotType {
    DISABLED("Disabled"),
    COMPACT("Compact"),
    LARGE("Large"),
    MOTORCYCLE("Motorcycle"),
    ELECTRIC_CAR("ElectricCar");

    private final String displayName;

    // Constructor
    ParkingSpotType(String displayName) {
        this.displayName = displayName;
    }

    // Getter method to access the default value
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
