package tn.esprit.ds.skikhalil_trabelsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.ds.skikhalil_trabelsi.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

}
