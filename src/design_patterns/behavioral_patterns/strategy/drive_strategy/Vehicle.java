package design_patterns.behavioral_patterns.strategy.drive_strategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // this is known as constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
