package tn.esprit.ds.skikhalil_trabelsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.skikhalil_trabelsi.entities.Cours;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long> {

}
