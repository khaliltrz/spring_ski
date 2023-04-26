package tn.esprit.ds.skikhalil_trabelsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.ds.skikhalil_trabelsi.entities.*;
import tn.esprit.ds.skikhalil_trabelsi.repositories.*;
import tn.esprit.ds.skikhalil_trabelsi.repositories.CoursRepository;
import java.util.List;
import java.util.Set;

@Service
public class ISkieurServiceImp implements ISkieurService{
    @Autowired
    SkieurRepository skieurRepository;
    @Autowired
    PisteRepository pisteRepository;
    @Autowired
    CoursRepository coursRepository;
    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {

        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur upDateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }
    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //Recuperation des objets
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        //verification non null
        if(skieur != null && piste != null){
            //Traitement
            piste.getSkieurs().add(skieur);
            //save
            pisteRepository.save(piste);
        }
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findSkieurByAbonnement_TypeAbon(typeAbonnement);
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        Assert.notNull(skieur.getAbonnement(),"Abonnement must be entered!!!"); //vérifier si l'objet abonn existe
        Assert.notNull(skieur.getInscription(),"Inscription must be entered!!!!");
        List<Inscription> inscriptions=skieur.getInscription();
        inscriptions.forEach(inscription -> {   //nparcouri liste taa inscrip w netfaked ken kol inscri aandha cours
            Assert.notNull(inscription.getCour().getNumCours(),"Cours must be entered!!!");
            Cours cours= coursRepository.findById(inscription.getCour().getNumCours()).orElse(null);
            Assert.notNull(cours,"No cours found with this id!!!");
            inscription.setCour(cours); //inscription aandou cours barka donc l inscrip houa li bech ygéri l relation et il va affecter inscrip lel cours
            //taw ki bech ntestiw , exception handler
        });
        skieurRepository.saveAndFlush(skieur); //ken bech nhotha dekhel l for mch bech ysajel les controles de saisie donc nhotha l bara w naawed naamel for lel skieur
        skieur.getInscription().forEach(inscription ->{
            inscription.setSkieur(skieur);
            inscriptionRepository.saveAndFlush(inscription);
        });
        return skieur;
    }

    @Override
    public List<Skieur> findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(TypeCours inscriptions_cours_typeCours, Support inscriptions_cours_support, Couleur pistes_couleur) {
        return skieurRepository.findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(inscriptions_cours_typeCours,inscriptions_cours_support,pistes_couleur);
    }

    @Override
    public List<Skieur> findByMoniteurNameAndSupportTypeJPQL(Support support, String nom) {
        return skieurRepository.findByMoniteurNameAndSupportTypeJPQL(support,nom);
    }
}
