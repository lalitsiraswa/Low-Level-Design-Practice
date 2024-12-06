package design_patterns.behavioral_patterns.strategy.drive_strategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
