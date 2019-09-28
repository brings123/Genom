package com.esi.genom.controllers.lot5;

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

import com.esi.genom.entities.lot5.EtatDemande;
import com.esi.genom.services.lot5.EtatDemandeService;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EtatDemandeController {
	
	@Autowired
	private EtatDemandeService etatDemandeService;
	
	@GetMapping("/allEtatDemande")
	public List<EtatDemande> getAllEtatDemande(){
	 	return etatDemandeService.getAllEtatDemande();
	}
	
	@GetMapping("/allEtatDemande/ordered_by/etat")
	public List<EtatDemande> getAllEtatDemandeOrderedByEtat(){
		return etatDemandeService.getAllEtatDemandeOrderedByEtat();
	}
	
		
	@PostMapping("/add_etat")
	public void addEtatDemande(@RequestBody EtatDemande etat) {
		etatDemandeService.addEtatDemande(etat);
	}
	
	@PutMapping("/update_etat/{id}")
	public void updateEtatDemande(@RequestBody EtatDemande etat, @PathVariable Long id) {
		etatDemandeService.updateEtatDemande(etat);
	}
	
	@DeleteMapping("/delete_etat/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		etatDemandeService.deleteEtatDemandeById(id);
	}

}
