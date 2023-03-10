package tn.esprit.ds.skikhalil_trabelsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.ds.skikhalil_trabelsi.entities.Skieur;
import tn.esprit.ds.skikhalil_trabelsi.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1")
    List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
}
