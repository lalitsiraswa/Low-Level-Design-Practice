package solid_principles.liskov_substitution_principle.solution;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle {
    public Boolean hasEngine() {
        return true;
    }
}

class MotorCycle extends EngineVehicle {
}

class Car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

class Bicycle extends Vehicle {
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }

        List<EngineVehicle> engineVehicles = new ArrayList<EngineVehicle>();
        engineVehicles.add(new Car());
        engineVehicles.add(new MotorCycle());
//        engineVehicles.add(new Bicycle());
        for (EngineVehicle vehicle : engineVehicles) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
