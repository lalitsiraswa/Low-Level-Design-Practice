package design_patterns.behavioral_patterns.strategy.drive_strategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
