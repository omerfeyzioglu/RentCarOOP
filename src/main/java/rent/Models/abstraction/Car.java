package rent.Models.abstraction;

import rent.Models.enums.FuelType;
import rent.Models.enums.GearType;
import rent.Models.enums.Segment;

public abstract class Car {

    private String model;
    private String brand;
    private String segment;
    private String gearType;
    private double baggageCapacity;
    private String color;
    private short age;
    private String fuelType;
    private GearType specificGearType;
    private FuelType specificFuelType;
    private Segment specificSegment;
    private short seatingCapacity;
    private double fuelTankCapacity;

    public Car(String model, String brand, String segment, String gearType, double baggageCapacity, String color, short age, String fuelType, GearType specificGearType, FuelType specificFuelType, Segment specificSegment, short seatingCapacity, double fuelTankCapacity) {
        this.model = model;
        this.brand = brand;
        this.segment = segment;
        this.gearType = gearType;
        this.baggageCapacity = baggageCapacity;
        this.color = color;
        this.age = age;
        this.fuelType = fuelType;
        this.specificGearType = specificGearType;
        this.specificFuelType = specificFuelType;
        this.specificSegment = specificSegment;
        this.seatingCapacity = seatingCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Car(String model, String brand, Segment segment, GearType gearType, double baggageCapacity, String color, short age, FuelType fuelType, short seatingCapacity, double fuelTankCapacity) {

    }

    public abstract double calculateMonthlyCarPrice();

    public abstract double calculateDailyCarPrice();

    public void setBaggageCapacity(double baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(short fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(short seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public GearType getSpecificGearType() {
        return specificGearType;
    }

    public void setSpecificGearType(GearType specificGearType) {
        this.specificGearType = specificGearType;
    }

    public FuelType getSpecificFuelType() {
        return specificFuelType;
    }

    public void setSpecificFuelType(FuelType specificFuelType) {
        this.specificFuelType = specificFuelType;
    }

    public Segment getSpecificSegment() {
        return specificSegment;
    }

    public void setSpecificSegment(Segment specificSegment) {
        this.specificSegment = specificSegment;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(short baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




}
