package rent.Models.concrete.Car;

import rent.Models.abstraction.Car;
import rent.Models.enums.FuelType;
import rent.Models.enums.GearType;
import rent.Models.enums.Level;
import rent.Models.enums.Segment;

public class Sedan extends Car {
    private Level comfortLevel;
    private Level infotainmentSystem;

    public Sedan(String model, String brand, String segment, String gearType, double baggageCapacity, String color, short age, String fuelType, GearType specificGearType, FuelType specificFuelType, Segment specificSegment, short seatingCapacity, double fuelTankCapacity, Level comfortLevel, Level infotainmentSystem) {
        super(model, brand, segment, gearType, baggageCapacity, color, age, fuelType, specificGearType, specificFuelType, specificSegment, seatingCapacity, fuelTankCapacity);
        this.comfortLevel = comfortLevel;
        this.infotainmentSystem = infotainmentSystem;
    }

    @Override
    public double calculateMonthlyCarPrice() {
        return calculateDailyCarPrice() * 30 * 94 / 100;
    }

    @Override
    public double calculateDailyCarPrice() {
        return 1300;
    }



    public Level getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(Level comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public Level getInfotainmentSystem() {
        return infotainmentSystem;
    }

    public void setInfotainmentSystem(Level infotainmentSystem) {
        this.infotainmentSystem = infotainmentSystem;
    }
}

