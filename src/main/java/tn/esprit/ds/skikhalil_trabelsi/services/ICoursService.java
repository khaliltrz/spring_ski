package tn.esprit.ds.skikhalil_trabelsi.services;

import tn.esprit.ds.skikhalil_trabelsi.entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCours();
    Cours addCours (Cours cours);
    void removeCours (Long numCours);
    Cours retrieveCours (Long numCours);
    Cours updateCours (Cours cours);
}
