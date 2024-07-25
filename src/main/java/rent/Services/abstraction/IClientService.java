package rent.Services.abstraction;

import rent.Models.abstraction.Client;

public interface IClientService {

        void addClient(Client client);
        Client getClientById(int id);
        void removeClient(int id);


}
