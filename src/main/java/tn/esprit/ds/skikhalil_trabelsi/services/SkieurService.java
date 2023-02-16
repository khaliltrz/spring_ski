package tn.esprit.ds.skikhalil_trabelsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.skikhalil_trabelsi.entities.Skieur;
import tn.esprit.ds.skikhalil_trabelsi.repositories.SkieurRepository;

import java.util.List;
@Service
public class SkieurService implements ISkieurService{
    @Autowired
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur upDateSkieur(Skieur skieur) {
        return null;
    }

    @Override
    public void removeSkieur(Long numSkieur) {

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById();
    }
}
