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


import com.esi.genom.entities.lot5.Detenteur;
import com.esi.genom.services.lot5.DetenteurService;


@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DeteneteurController {
	
	@Autowired
	private DetenteurService detenteurService;
	
	@GetMapping("/alldetenteurs")
	public List<Detenteur> getAllDetenteur(){
	 	return detenteurService.getAllDetenteur();
	}
	
	@GetMapping("/alldetenteurs/ordered_by/prenoms")
	public List<Detenteur> getAlldetenteurOrderedByPrenom(){
		return detenteurService.getAllDetenteurOrderedByPrenom();
	}
	
	
	@GetMapping("/alldetenteurs/of/{prenom}/ordered_by/prenom")
	public List<Detenteur> getAlldetenteurOfPrenomOrderedByPrenom(@PathVariable String prenom){
		return detenteurService.getAllDetenteurOfPrenom(prenom);
	}

	@GetMapping("/alldetenteurs/of/{nom}/ordered_by/nom")
	public List<Detenteur> getAlldetenteurOfPrenomOrderedByNom(@PathVariable String nom){
		return detenteurService.getAllDetenteurOfNom(nom);
	}
	
	@GetMapping("/alldetenteurs/of/{nom}/{prenom}/ordered_by/prenom")
	public List<Detenteur> getAlldetenteurOfNomAndPrenom(@PathVariable String nom,  @PathVariable String prenom){
		return detenteurService.getAllDetenteurOfNomAndPrenom(nom, prenom);
	}
	
	
	@GetMapping("/detenteur/{id}")
	public Detenteur getdetenteurOfId(@PathVariable Long id) {
		return detenteurService.getDetenteurOfId(id);
	}
	
	@PostMapping("/add_detenteur")
	public void adddetenteur(@RequestBody Detenteur detenteur) {
		detenteurService.addDetenteur(detenteur);
	}
	
	@PutMapping("/update_detenteur/{id}")
	public void updatedetenteur(@RequestBody Detenteur detenteur, @PathVariable Long id) {
		detenteurService.updateDetenteur(detenteur);
	}
	
	@DeleteMapping("/delete_detenteurs/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		detenteurService.deleteByIdDetenteur(id);
	}

}
