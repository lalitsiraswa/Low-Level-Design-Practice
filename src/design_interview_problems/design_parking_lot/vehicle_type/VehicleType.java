package design_interview_problems.design_parking_lot.vehicle_type;

public enum VehicleType {
    CAR("Car"),
    MOTORCYCLE("Motorcycle"),
    TRUCK("Truck"),
    ELECTRIC_CAR("Electric Car"),
    VAN("Van");

    private final String displayName;

    // Constructor
    VehicleType(String displayName) {
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
