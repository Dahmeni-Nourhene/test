package com.example.testdahmeninourhene.Services.Client;

import com.example.testdahmeninourhene.Entities.Client;
import com.example.testdahmeninourhene.Repositories.ClientRepository;
import com.example.testdahmeninourhene.Repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{

    MenuRepository menuRepository;
    ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void AffecterClientAuMenu(String identifiant, String libelleMenu) {
//        List<Client> client = clientRepository.findByIdentifiant(identifiant);
//        List<Menu> menu = menuRepository.findByLibelleMenu(libelleMenu);
//        client.getMenus().add(menu);
//        menu.getClients().add(client);
//        clientRepository.save(client);
    }
}
