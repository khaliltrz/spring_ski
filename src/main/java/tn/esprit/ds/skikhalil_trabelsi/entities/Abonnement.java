package tn.esprit.ds.skikhalil_trabelsi.entities;


import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class Abonnement {
    private long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    private TypeAbonnement typeAbon;
@OneToOne(mappedBy="abonnement",cascade = CascadeType.REMOVE)
    Skieur skieur;


}
