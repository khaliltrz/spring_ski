package tn.esprit.ds.skikhalil_trabelsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skikhalil_trabelsi.entities.Piste;
import tn.esprit.ds.skikhalil_trabelsi.services.IPisteService;

import java.util.List;
@RestController
@RequestMapping("/piste")
public class PisteController {
    @Autowired
    IPisteService pisteService;
    @GetMapping
    public List<Piste> getAll(){
        return pisteService.retrieveAllPistes();
    }
    @GetMapping("/{numPiste}")
    public Piste retrievePiste (@PathVariable Long numPiste){
        return pisteService.retrievePiste(numPiste);
    }
    @PostMapping
    public Piste postPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }
    @PutMapping
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteService.updatePiste(piste);
    }
    @DeleteMapping("/{id}")
    public void removePiste (@PathVariable(name = "id") Long numPiste){
        pisteService.removePiste(numPiste);
    }

}
