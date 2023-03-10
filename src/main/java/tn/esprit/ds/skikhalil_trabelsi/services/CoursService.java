package tn.esprit.ds.skikhalil_trabelsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.ds.skikhalil_trabelsi.entities.Cours;
import tn.esprit.ds.skikhalil_trabelsi.repositories.CoursRepository;

import java.util.List;

@Service
public class CoursService implements ICoursService{
    @Autowired
    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void removeCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }
    @Override
    public Cours updateCours(Cours cours){
        return coursRepository.save(cours);
    }
}
