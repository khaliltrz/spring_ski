package tn.esprit.ds.skikhalil_trabelsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skikhalil_trabelsi.entities.*;
import tn.esprit.ds.skikhalil_trabelsi.repositories.PisteRepository;
import tn.esprit.ds.skikhalil_trabelsi.services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    ISkieurService skieurService;
    @GetMapping
    public List<Skieur> getAll(){
        return skieurService.retrieveAllSkieurs();
    }
    @GetMapping("/{numSkieur}")
    public Skieur retrieveSkieur (@PathVariable Long numSkieur){
        return skieurService.retrieveSkieur(numSkieur);
    }
    @PostMapping
    public Skieur postSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return skieurService.upDateSkieur(skieur);
    }
    @DeleteMapping("/{id}")
    public void removeSkieur (@PathVariable(name = "id") Long numSkieur){
        skieurService.removeSkieur(numSkieur);
    }
    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
        return skieurService.assignSkierToPiste(numSkieur,numPiste);
    }
    @PutMapping("/{typeAbonnement}")
    public List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable(name = "typeAbonnement") TypeAbonnement typeAbonnement) {
        return skieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }
    Skieur addSkierAndAssignToCourse(Skieur skieur){
        return skieurService.addSkierAndAssignToCourse(skieur);
    }
    public List<Skieur> findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(TypeCours inscriptions_cours_typeCours, Support inscriptions_cours_support, Couleur pistes_couleur){
        return skieurService.findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(inscriptions_cours_typeCours,inscriptions_cours_support,pistes_couleur);
    }
}
