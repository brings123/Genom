package com.esi.genom.controllers.lot5;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.services.lot5.DemandeService;
import com.esi.genom.entities.lot5.Demande;
import com.esi.genom.entities.lot5.Demandeur;
import com.esi.genom.entities.lot5.EtatDemande;;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DemandeController {
	
	@Autowired
	private DemandeService demandeService;
	
	@GetMapping("/alldemandes")
	public List<Demande> getAllDemandes(){
		return demandeService.getAllDemandes();
	}
	
	@GetMapping("/alldemandes/of_date/{date}")
	public List<Demande> getAllDemandesOfDateDemande(@PathVariable Date date){
		return demandeService.getAllDemandesOfDateDemande(date);
	}

	
	@GetMapping("/alldemandes/of_etat/{etat}")
	public List<Demande> getAllDemandesOfEtatDemande(@PathVariable EtatDemande etat){
		return demandeService.getAllDemandesOfEtatDemande(etat);
	}
	
	@GetMapping("/alldemandes/of_demandeur/{demandeur}")
	public List<Demande> getAllDemandesOfDemandeur(@PathVariable Demandeur demandeur){
		return demandeService.getAllDemandesOfDemandeur(demandeur);
	}
	
	@GetMapping("/demande/{id}")
	public Demande getDemandeById(@PathVariable Long id){
		return demandeService.getDemandeById(id);
	}
	
	@PostMapping("/addDemande")
	public void addDemande(@RequestBody Demande demande) {
		demandeService.addDemande(demande);
	}
	
	@PutMapping("/updateDemande/{id}")
	public void updateDemande(@RequestBody Demande demande, @PathVariable Long id) {
		demandeService.addDemande(demande);
	}
	
	@DeleteMapping("deleteDemande/{id}")
	public void deleteDemandeById(@PathVariable Long id) {
		demandeService.deleteDemandeById(id);
	}
	
	
}
