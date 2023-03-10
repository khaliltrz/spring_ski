package tn.esprit.ds.skikhalil_trabelsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skikhalil_trabelsi.entities.Abonnement;
import tn.esprit.ds.skikhalil_trabelsi.entities.TypeAbonnement;
import tn.esprit.ds.skikhalil_trabelsi.services.IAbonnementService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService abonnementService;
    @GetMapping
    public List<Abonnement> getAll(){
        return abonnementService.retrieveAllAbonnements();
    }
    @GetMapping("/{numAbonnement}")
    public Abonnement retrieveAbonnement (@PathVariable Long numAbonnement){
        return abonnementService.retrieveAbonnement(numAbonnement);
    }
    @PostMapping
    public Abonnement postAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.addAbonnement(abonnement);
    }
    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.updateAbonnement(abonnement);
    }
    @DeleteMapping("/{id}")
    public void removeAbonnement (@PathVariable(name = "id") Long numAbonnement){
        abonnementService.removeAbonnement(numAbonnement);
    }

    public Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement) {
        return abonnementService.getSubscriptionByType(typeAbonnement);
    }


    public List<Abonnement> retreiveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return abonnementService.retreiveSubscriptionsByDates(startDate,endDate);
    }
}
