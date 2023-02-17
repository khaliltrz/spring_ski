package tn.esprit.ds.skikhalil_trabelsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skikhalil_trabelsi.entities.Skieur;
import tn.esprit.ds.skikhalil_trabelsi.services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("skieur")
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    @GetMapping("retrieveAllSkieurs")
    public List<Skieur> getAll()
    {
        return iSkieurService.retrieveAllSkieurs();
    }
    @PostMapping
    public Skieur add(@RequestBody Skieur skieur){

        return iSkieurService.addSkieur(skieur);
    }
    @DeleteMapping("{numSkieur}")
    public void removeSkieur(@PathVariable long numSkieur) {
        iSkieurService.removeSkieur(numSkieur);
    }
    @PutMapping("update")
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return iSkieurService.upDateSkieur(skieur);
    }
    @GetMapping("{numSkieur}")
    public Skieur retrieveSkieur(@PathVariable Long numSkieur)
    {
        return iSkieurService.retrieveSkieur(numSkieur);
    }

}
