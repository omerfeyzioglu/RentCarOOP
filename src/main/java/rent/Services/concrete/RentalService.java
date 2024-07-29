package rent.Services.concrete;

import rent.Services.abstraction.IRentalService;
import rent.Models.abstraction.Car;
import rent.Models.abstraction.Client;
import rent.Models.concrete.Car.SUV;
import rent.Models.concrete.Car.Sedan;
import rent.Models.concrete.Car.Hatchback;

public class RentalService implements IRentalService {

    @Override
    public void rentCar(Client client, Car car, int days) {
        if (client != null && car != null) {
            if (!client.canRentCarType(car.getClass().getSimpleName())) {
                throw new IllegalArgumentException("Bu müşteri bu tür aracı kiralayamaz.");
            }

            double totalCost;
            boolean isMonthlyRental = days > 30;

            if (car instanceof SUV) {
                if (isMonthlyRental) {
                    throw new IllegalArgumentException("SUV araçlar sadece günlük kiralanabilir.");
                }
                totalCost = car.calculateDailyCarPrice() * days;
            } else {
                if (isMonthlyRental) {
                    totalCost = car.calculateMonthlyCarPrice();
                } else {
                    totalCost = car.calculateDailyCarPrice() * days;
                }
            }

            System.out.println("Araç " + client.getName() + " tarafından " + days + " günlüğüne kiralandı. Toplam maliyet: " + totalCost);
        } else {
            throw new IllegalArgumentException("Müşteri veya araç boş olamaz.");
        }
    }

    @Override
    public void returnCar(Client client, Car car) {
        if (client != null && car != null) {
            System.out.println(client.getName() + " tarafından kiralanan araç geri getirildi.");
        } else {
            throw new IllegalArgumentException("Müşteri veya araç boş olamaz.");
        }
    }
}
