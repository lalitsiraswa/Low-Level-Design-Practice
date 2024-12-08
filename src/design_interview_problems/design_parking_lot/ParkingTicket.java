package design_interview_problems.design_parking_lot;

import design_interview_problems.design_parking_lot.vehicle_type.VehicleType;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    private String parkingTicketId;
    private VehicleType vehicleType;
    private String vehicleRegistrationNumber;
    private String parkingSpotId;
    private String parkingFloorId;
    private Date startTime;
    private Date endTime;
    private int amount;

    public ParkingTicket(VehicleType vehicleType, String vehicleRegistrationNumber, String parkingSpotId, String parkingFloorId) {
        this.vehicleType = vehicleType;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.parkingSpotId = parkingSpotId;
        this.parkingFloorId = parkingFloorId;
        this.parkingTicketId = UUID.randomUUID().toString();
    }

    public ParkingTicket setStartTime() {
        this.startTime = new Date();
        return this;
    }

    public ParkingTicket setEndTime() {
        this.endTime = new Date();
        return this;
    }

    public ParkingTicket setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public int getAmount() {
        return this.amount;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public String getParkingSpotId() {
        return this.parkingSpotId;
    }

    public String getParkingFloorId() {
        return this.parkingFloorId;
    }

    public String getVehicleRegistrationNumber() {
        return this.vehicleRegistrationNumber;
    }
}
