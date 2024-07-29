package rent.Models.concrete.Client;

import rent.Models.abstraction.Client;

public class IndividualClient extends Client {
    private String identityNumber; //we defined as string cause of there is no operation.


    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public IndividualClient(String phoneNumber, String name, String identityNumber) {
        super(phoneNumber, name);
        this.identityNumber=identityNumber;
    }

    @Override
    public boolean canRentCarType(String carType) {
        return carType.equals("Sedan") || carType.equals("Hatchback")   ;
    }
}
