package tn.esprit.ds.skikhalil_trabelsi.entities;

import javax.persistence.CascadeType;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

public class Moniteur {
    private long numMoniteur;
    private String nomM;
    private String prenom;
    private LocalDate dateRecru;
@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    Set<Cours> cours;
}
