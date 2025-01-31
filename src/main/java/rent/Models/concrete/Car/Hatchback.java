package rent.Models.concrete.Car;

import rent.Models.abstraction.Car;
import rent.Models.enums.FuelType;
import rent.Models.enums.GearType;
import rent.Models.enums.Segment;

public class Hatchback extends Car {
     private boolean rearSeatFoldable;

     public Hatchback(String model, String brand, GearType gearType, double baggageCapacity, String color, short age, FuelType fuelType, short seatingCapacity, double fuelTankCapacity, boolean rearSeatFoldable) {
          super(model, brand, Segment.HATCHBACK, gearType, baggageCapacity, color, age, fuelType, seatingCapacity, fuelTankCapacity);
          this.rearSeatFoldable = rearSeatFoldable;
     }

     public boolean isRearSeatFoldable() {
          return rearSeatFoldable;
     }

     public void setRearSeatFoldable(boolean rearSeatFoldable) {
          this.rearSeatFoldable = rearSeatFoldable;
     }

     @Override
     public double calculateMonthlyCarPrice() {
          return calculateDailyCarPrice() * 30 * 0.90; // Hatchback cars have a 10% discount on monthly rental.
     }

     @Override
     public double calculateDailyCarPrice() {
          return 1200;
     }
}
