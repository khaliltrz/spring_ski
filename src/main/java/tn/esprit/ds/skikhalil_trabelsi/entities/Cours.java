package tn.esprit.ds.skikhalil_trabelsi.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours TypeCours;
    @Enumerated(EnumType.ORDINAL)
    private Support support;
    private Float prix;
    private int creneau;
    @OneToMany(mappedBy="cour")
    private List<Inscription> inscriptions;

}
