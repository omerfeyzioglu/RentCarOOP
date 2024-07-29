package rent.Models.abstraction;

public abstract class Client {
     private  String name;
     private  String phoneNumber;     //it is not going to be used in any operation so that 'String'

    public Client(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean canRentCarType(String carType);
}
