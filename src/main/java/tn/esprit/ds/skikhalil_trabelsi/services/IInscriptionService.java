package tn.esprit.ds.skikhalil_trabelsi.services;

import tn.esprit.ds.skikhalil_trabelsi.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addInscription (Inscription inscription);
    void removeInscription (Long numInscription);
    Inscription retrieveInscription (Long numInscription);
    Inscription updateInscription(Inscription inscription);
}
