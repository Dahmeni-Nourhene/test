package com.example.testdahmeninourhene.Repositories;
import com.example.testdahmeninourhene.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {

    List<Client> findByIdentifiant(String identifiant);


}