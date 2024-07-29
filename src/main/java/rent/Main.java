package rent;

import rent.Models.abstraction.Car;
import rent.Models.abstraction.Client;
import rent.Models.concrete.Car.Hatchback;
import rent.Models.concrete.Car.SUV;
import rent.Models.concrete.Car.Sedan;
import rent.Models.concrete.Client.CooperateClient;
import rent.Models.concrete.Client.IndividualClient;
import rent.Models.enums.FuelType;
import rent.Models.enums.GearType;
import rent.Services.concrete.CarService;
import rent.Services.concrete.ClientService;
import rent.Services.concrete.RentalService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        ClientService clientService = new ClientService();
        RentalService rentalService = new RentalService();


        Car hatchback = new Hatchback("Civic", "Honda", GearType.AUTOMATIC, 450, "Red", (short) 3, FuelType.GASOLINE, (short) 5, 50.0, true);
        Car suv = new SUV("X5", "BMW", GearType.AUTOMATIC, 500, "Black", (short) 5, FuelType.DIESEL, (short) 5, 65.0, true, 210, 2000, true, true);

        carService.addCar(hatchback);
        carService.addCar(suv);


        Client individualClient = new IndividualClient("1234567890", "Emine Özbek", "1123123901");
        Client cooperateClient = new CooperateClient("0987654321", "XYZ Ltd.", "234923649");

        clientService.addClient(individualClient);
        clientService.addClient(cooperateClient);


        rentalService.rentCar(individualClient, hatchback, 5);
        rentalService.rentCar(individualClient, suv, 2);
        // rentalService.rentCar(individualClient, suv, 2); // Bu satır hata verecektir çünkü bireysel müşteri SUV kiralayamaz
    }
}
