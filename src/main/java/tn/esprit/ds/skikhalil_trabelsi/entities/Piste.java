package tn.esprit.ds.skikhalil_trabelsi.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    private Couleur Couleur;
    private int longeur;
    private int pente;
    @ManyToMany
    private List<Skieur> skieurs;
}
