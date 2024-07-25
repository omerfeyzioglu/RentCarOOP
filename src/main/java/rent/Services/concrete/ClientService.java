package rent.Services.concrete;

import rent.Services.abstraction.IClientService;
import rent.Models.abstraction.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService implements IClientService {
    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public Client getClientById(int id) {
        if (id >= 0 && id < clients.size()) {
            return clients.get(id);
        }
        throw new IllegalArgumentException("Invalid client ID");
    }

    @Override
    public void removeClient(int id) {
        if (id >= 0 && id < clients.size()) {
            clients.remove(id);
        } else {
            throw new IllegalArgumentException("Invalid client ID");
        }
    }
}
