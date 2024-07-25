package rent.Models.concrete;

import rent.Models.abstraction.Car;
import rent.Models.abstraction.FuelType;
import rent.Models.abstraction.GearType;
import rent.Models.abstraction.Segment;


public class SUV extends Car {

    private boolean fourWheelDrive;
    private double groundClearance;
    private double towingCapacity;
    private boolean offRoadCapability;
    private boolean roofRails;
    private double cargoSpace;

    @Override
    public double calculateMonthlyCarPrice()  {
        try {
            throw new Exception("SUV CAN NOT BE RENTED MONTHLY");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double calculateDailyCarPrice() {
            return 2900;
    }

    public SUV() {

        this.fourWheelDrive = true;
        this.groundClearance = 300;    //milimeter
        this.towingCapacity = 1750;    //kg
        this.offRoadCapability = true;
        this.roofRails = true;
        this.cargoSpace = 475;     //liter
        this.setSpecificSegment(Segment.SUV);
        this.setSpecificFuelType(FuelType.DIESEL);
        this.setSpecificGearType(GearType.AUTOMATIC);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(short groundClearance) {
        this.groundClearance = groundClearance;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(short towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public boolean isOffRoadCapability() {
        return offRoadCapability;
    }

    public void setOffRoadCapability(boolean offRoadCapability) {
        this.offRoadCapability = offRoadCapability;
    }

    public boolean isRoofRails() {
        return roofRails;
    }

    public void setRoofRails(boolean roofRails) {
        this.roofRails = roofRails;
    }




    public double getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public void setGroundClearance(double groundClearance) {
        this.groundClearance = groundClearance;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }


}
