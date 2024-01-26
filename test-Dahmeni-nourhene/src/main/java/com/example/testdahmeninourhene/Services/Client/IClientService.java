package com.example.testdahmeninourhene.Services.Client;



import com.example.testdahmeninourhene.Entities.Client;

import java.util.List;

public interface IClientService {
     Client ajouterClient(Client client);

     void AffecterClientAuMenu(String identifiant, String libelleMenu);

}
