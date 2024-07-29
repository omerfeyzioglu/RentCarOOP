package rent.Services.concrete;

import rent.Services.abstraction.ICarService;
import rent.Models.abstraction.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService {
    private List<Car> cars = new ArrayList<>();

    @Override
    public double calculateMonthlyPrice(Car car) {
        return car.calculateMonthlyCarPrice();
    }

    @Override
    public double calculateDailyPrice(Car car) {
        return car.calculateDailyCarPrice();
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public Car getCarById(int id) {
        if (id >= 0 && id < cars.size()) {
            return cars.get(id);
        }
        throw new IllegalArgumentException("Invalid car ID");
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void removeCar(int id) {
        if (id >= 0 && id < cars.size()) {
            cars.remove(id);
        } else {
            throw new IllegalArgumentException("Invalid car ID");
        }
    }
}
