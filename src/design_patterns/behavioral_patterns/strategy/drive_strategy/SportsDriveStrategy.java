package design_patterns.behavioral_patterns.strategy.drive_strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Strategy!");
    }
}
