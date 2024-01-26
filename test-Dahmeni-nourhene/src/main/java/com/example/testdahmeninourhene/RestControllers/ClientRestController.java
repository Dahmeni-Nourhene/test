package com.example.testdahmeninourhene.RestControllers;

import com.example.testdahmeninourhene.Client.ClientService;
import com.example.testdahmeninourhene.Entities.Client;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientRestController {

    ClientService clientService;

    @PostMapping
    public Client addClient(Client client) {
        return clientService.ajouterClient(client);

    }


}