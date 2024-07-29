package rent.Models.concrete.Client;

import rent.Models.abstraction.Client;

import java.rmi.server.UID;

public class CooperateClient extends Client {

    private String taxNUmber;

    public CooperateClient(String phoneNumber, String name, String taxNUmber) {
        super(phoneNumber, name);
        this.taxNUmber = taxNUmber;
    }

    public String getTaxNUmber() {
        return taxNUmber;
    }

    public void setTaxNUmber(String taxNUmber) {
        this.taxNUmber = taxNUmber;
    }

    @Override
    public boolean canRentCarType(String carType) {
        return true;  //Şirketlerin tüm araçları kiralayabileceğini gösterir.
    }
}
