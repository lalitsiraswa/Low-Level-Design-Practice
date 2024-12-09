package design_interview_problems.design_parking_lot_by_ashish_pratap_singh;

import design_interview_problems.design_parking_lot_by_ashish_pratap_singh.vehicle_type.Car;
import design_interview_problems.design_parking_lot_by_ashish_pratap_singh.vehicle_type.Motorcycle;
import design_interview_problems.design_parking_lot_by_ashish_pratap_singh.vehicle_type.Truck;
import design_interview_problems.design_parking_lot_by_ashish_pratap_singh.vehicle_type.Vehicle;

public class Client {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 10));
//        parkingLot.addLevel(new Level(2, 6));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ786");
        Vehicle motorcycle = new Motorcycle("MTV345");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // UnPark vehicle
        parkingLot.unParkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();
    }
}
