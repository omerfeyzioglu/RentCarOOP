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

    public SUV(String model, String brand, GearType gearType, double baggageCapacity, String color, short age, FuelType fuelType, short seatingCapacity, double fuelTankCapacity, boolean fourWheelDrive, double groundClearance, double towingCapacity, boolean offRoadCapability, boolean roofRails) {
        super(model, brand, Segment.SUV, gearType, baggageCapacity, color, age, fuelType, seatingCapacity, fuelTankCapacity);
        this.fourWheelDrive = fourWheelDrive;
        this.groundClearance = groundClearance;
        this.towingCapacity = towingCapacity;
        this.offRoadCapability = offRoadCapability;
        this.roofRails = roofRails;
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

    public void setGroundClearance(double groundClearance) {
        this.groundClearance = groundClearance;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
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

    @Override
    public double calculateMonthlyCarPrice() {
        return calculateDailyCarPrice() * 30;
    }

    @Override
    public double calculateDailyCarPrice() {
        return 650;
    }
}
