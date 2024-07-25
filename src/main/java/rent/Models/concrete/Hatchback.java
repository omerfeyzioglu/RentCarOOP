package rent.Models.concrete;

import rent.Models.abstraction.Car;

public class Hatchback extends Car {
     private boolean rearSeatFoldable;

     public boolean isRearSeatFoldable() {
          return rearSeatFoldable;
     }

     public void setRearSeatFoldable(boolean rearSeatFoldable) {
          this.rearSeatFoldable = rearSeatFoldable;
     }

     @Override
     public double calculateMonthlyCarPrice() {
           return calculateDailyCarPrice() * 30 * 90 / 100 ;
           // Hatchback cars have a 10-percent discount on monthly rental.
     }

     @Override
     public double calculateDailyCarPrice() {
          return 1200;
     }
}
