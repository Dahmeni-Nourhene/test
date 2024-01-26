package com.example.testdahmeninourhene.Repositories;

import com.example.testdahmeninourhene.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    List<Menu> findByLibelleMenu(String libelleMenu);
}