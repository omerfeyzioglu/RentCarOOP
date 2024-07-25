package rent.Services.abstraction;

import rent.Models.abstraction.Car;

import java.util.List;

public interface ICarService {
    double calculateMonthlyPrice(Car car);
    double calculateDailyPrice(Car car);
    List<Car> getAllCars();
    Car getCarById(int id);
    void addCar(Car car);
    void removeCar(int id);

}
