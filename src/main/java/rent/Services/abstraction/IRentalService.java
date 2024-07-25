package rent.Services.abstraction;

import rent.Models.abstraction.Car;
import rent.Models.abstraction.Client;

public interface IRentalService {
    void rentCar(Client client, Car car, int days);
    void returnCar(Client client, Car car);
}
