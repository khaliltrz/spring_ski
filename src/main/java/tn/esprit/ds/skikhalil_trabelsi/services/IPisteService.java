package tn.esprit.ds.skikhalil_trabelsi.services;

import tn.esprit.ds.skikhalil_trabelsi.entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste (Piste piste);
    void removePiste (Long numPiste);
    Piste retrievePiste (Long numPiste);
    Piste updatePiste(Piste piste);
}
