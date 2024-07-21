package rent.Models.abstraction;

public abstract class Car {

    public String model;
    public String brand;
    public String segment;
    public String gearType;
    public short baggageCapacity;
    public String color;
    public short age;
    public String fuelType;


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

    public short getBaggageCapacity() {
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

    public void rentableforDay(int x){
        System.out.println( x + "gün kiralanabilir");
    }

    public void rentableBy(Object object){

    }

    public double price(){  
        int rentPrice = 0;
        return rentPrice;
    }
}
