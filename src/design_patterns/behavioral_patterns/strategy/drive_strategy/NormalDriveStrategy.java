package design_patterns.behavioral_patterns.strategy.drive_strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy!");
    }
}
