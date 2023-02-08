package tn.esprit.ds.skikhalil_trabelsi.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;
}
