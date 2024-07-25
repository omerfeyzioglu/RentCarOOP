package rent.Models.concrete.Car;

import rent.Models.abstraction.Car;
import rent.Models.enums.FuelType;
import rent.Models.enums.GearType;
import rent.Models.enums.Segment;


public class SUV extends Car {


    private boolean fourWheelDrive;
    private double groundClearance;
    private double towingCapacity;
    private boolean offRoadCapability;
    private boolean roofRails;
    private double cargoSpace;

    public SUV(String model, String brand, String segment, String gearType, double baggageCapacity, String color, short age,
               String fuelType, GearType specificGearType, FuelType specificFuelType, Segment specificSegment, short seatingCapacity,double fuelTankCapacity, boolean fourWheelDrive, double groundClearance, double towingCapacity, boolean offRoadCapability,boolean roofRails, double cargoSpace ) {
        super(model, brand, segment, gearType, baggageCapacity, color, age, fuelType, specificGearType, specificFuelType, specificSegment, seatingCapacity, fuelTankCapacity);
        this.fourWheelDrive = fourWheelDrive;
        this.groundClearance = groundClearance;
        this.towingCapacity = towingCapacity;
        this.offRoadCapability = offRoadCapability;
        this.roofRails = roofRails;
        this.cargoSpace = cargoSpace;
    }

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
