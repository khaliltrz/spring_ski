package tn.esprit.ds.skikhalil_trabelsi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
    @ManyToMany
    private List<Piste> pistes;
   @OneToMany
   private List<Inscription> inscriptions;
    @OneToOne(cascade = CascadeType.REMOVE)
    private Abonnement abonnement;
}
