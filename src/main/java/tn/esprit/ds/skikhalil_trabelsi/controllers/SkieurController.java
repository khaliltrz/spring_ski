package tn.esprit.ds.skikhalil_trabelsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ds.skikhalil_trabelsi.entities.Skieur;
import tn.esprit.ds.skikhalil_trabelsi.services.ISkieurService;

import java.util.List;

@RestController
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    @GetMapping("retrieveAllSkieurs")
    public List<Skieur> getAll()
    {
        return iSkieurService.retrieveAllSkieurs();
    }
    @PostMapping("addSkieur")
    public Skieur add(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);
    }
}
