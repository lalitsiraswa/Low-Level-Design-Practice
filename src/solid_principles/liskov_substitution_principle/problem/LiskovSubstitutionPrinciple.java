package solid_principles.liskov_substitution_principle.problem;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class MotorCycle extends Vehicle {
}

class Car extends Vehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

class Bicycle extends Vehicle {
    @Override
    public Boolean hasEngine() {
        return null;
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
