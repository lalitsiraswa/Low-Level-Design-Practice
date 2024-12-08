package design_interview_problems.design_parking_lot.vehicle_type;

public abstract class Vehicle {
    private String registrationNumber;
    private VehicleType vehicleType;

    public Vehicle(String registrationNumber, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public VehicleType getType() {
        return this.vehicleType;
    }
}
