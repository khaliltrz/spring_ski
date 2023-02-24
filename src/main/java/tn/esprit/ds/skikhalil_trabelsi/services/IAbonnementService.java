package tn.esprit.ds.skikhalil_trabelsi.services;

import tn.esprit.ds.skikhalil_trabelsi.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    void removeAbonnement (Long numAbon);
    Abonnement retrieveAbonnement (Long numAbon);
    Abonnement updateAbonnement(Abonnement abonnement);
}
