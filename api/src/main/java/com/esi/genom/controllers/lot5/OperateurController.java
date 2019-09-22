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

import com.esi.genom.entities.lot5.Operateur;
import com.esi.genom.services.lot5.OperateurService;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class OperateurController {
	
	@Autowired
	private OperateurService operateurService;
	
	@GetMapping("/allOperateurs")
	public List<Operateur> getAllOperateur(){
	 	return operateurService.getAllOperateur();
	}
	
	@GetMapping("/allOperateurs/ordered_by/prenoms")
	public List<Operateur> getAllOperateurOrderedByPrenom(){
		return operateurService.getAllOperateurOrderedByPrenom();
	}
	
	
	@GetMapping("/allOperateurs/of/{prenom}/ordered_by/prenom")
	public List<Operateur> getAllOperateurOfPrenomOrderedByPrenom(@PathVariable String prenom){
		return operateurService.getAllOperateurOfPrenom(prenom);
	}

	@GetMapping("/allOperateurs/of/{nom}/ordered_by/nom")
	public List<Operateur> getAllOperateurOfPrenomOrderedByNom(@PathVariable String nom){
		return operateurService.getAllOperateurOfNom(nom);
	}
	
	@GetMapping("/allOperateurs/of/{nom}/{prenom}/ordered_by/prenom")
	public List<Operateur> getAllOperateurOfNomAndPrenom(@PathVariable String nom,  @PathVariable String prenom){
		return operateurService.getAllOperateurOfNomAndPrenom(nom, prenom);
	}
	
	
	@GetMapping("/Operateur/{id}")
	public Operateur getOperateurOfId(@PathVariable Long id) {
		return operateurService.getOperateurOfId(id);
	}
	
	@PostMapping("/add_Operateur")
	public void addOperateur(@RequestBody Operateur Operateur) {
		operateurService.addOperateur(Operateur);
	}
	
	@PutMapping("/update_Operateur/{id}")
	public void updateOperateur(@RequestBody Operateur Operateur, @PathVariable Long id) {
		operateurService.updateOperateur(Operateur);
	}
	
	@DeleteMapping("/delete_Operateurs/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		operateurService.deleteByIdOperateur(id);
	}

}
