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

import com.esi.genom.entities.lot5.Demandeur;
import com.esi.genom.services.lot5.DemandeurService;


@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DemandeurController {

	@Autowired
	private DemandeurService demandeurService;
	
	@GetMapping("/alldemandeurs")
	public List<Demandeur> getAllDemandeur(){
	 	return demandeurService.getAllDemandeur();
	}
	
	@GetMapping("/alldemandeurs/ordered_by/prenoms")
	public List<Demandeur> getAllDemandeurOrderedByPrenom(){
		return demandeurService.getAllDemandeurOrderedByPrenom();
	}
	
	
	@GetMapping("/alldemandeurs/of/{prenom}/ordered_by/prenom")
	public List<Demandeur> getAllDemandeurOfPrenomOrderedByPrenom(@PathVariable String prenom){
		return demandeurService.getAllDemandeurOfPrenom(prenom);
	}

	@GetMapping("/alldemandeurs/of/{nom}/ordered_by/nom")
	public List<Demandeur> getAllDemandeurOfPrenomOrderedByNom(@PathVariable String nom){
		return demandeurService.getAllDemandeurOfNom(nom);
	}
	
	@GetMapping("/alldemandeurs/of/{nom}/{prenom}/ordered_by/prenom")
	public List<Demandeur> getAllDemandeurOfNomAndPrenom(@PathVariable String nom,  @PathVariable String prenom){
		return demandeurService.getAllDemandeurOfNomAndPrenom(nom, prenom);
	}
	
	
	@GetMapping("/demandeur/{id}")
	public Demandeur getDemandeurOfId(@PathVariable Long id) {
		return demandeurService.getDemandeurOfId(id);
	}
	
	@PostMapping("/add_demandeur")
	public void addDemandeur(@RequestBody Demandeur demandeur) {
		demandeurService.addDemandeur(demandeur);
	}
	
	@PutMapping("/update_demandeur/{id}")
	public void updateDemandeur(@RequestBody Demandeur demandeur, @PathVariable Long id) {
		demandeurService.updateDemandeur(demandeur);
	}
	
	@DeleteMapping("/delete_demandeurs/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		demandeurService.deleteByIdDemandeur(id);
	}
}
