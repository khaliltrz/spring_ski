package tn.esprit.ds.skikhalil_trabelsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.ds.skikhalil_trabelsi.entities.Abonnement;
import tn.esprit.ds.skikhalil_trabelsi.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

    Set<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
    Set<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findByDateDebutAndDateFin(LocalDate startDate, LocalDate endDate);
}
