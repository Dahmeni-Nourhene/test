package com.example.testdahmeninourhene.Services.Composant;



import com.example.testdahmeninourhene.Entities.Composant;
import com.example.testdahmeninourhene.Entities.Menu;
import com.example.testdahmeninourhene.Repositories.ComposantRepository;

import java.util.Set;

public class ComposantService implements IComposantService {
    ComposantRepository composantRepository;
    @Override
    public Menu ajoutComposantEtMiseAJourPrixTotalMenu(Set<Composant> composants, Long idMenu) {
        float prix =0;

        Set<Composant> composants1= (Set<Composant>) composantRepository.findAll();
        for (Composant c : composants1) {
        if(c.getMenu().getPrixTotal()<20)   {
            prix += c.getPrix();
        }
        }
        return null;
    }
}
