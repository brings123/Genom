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

import com.esi.genom.entities.lot5.Responsable;
import com.esi.genom.services.lot5.ResponsableService;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ResponsableController {
	
	@Autowired
	private ResponsableService responsableService;
	
	@GetMapping("/allResponsables")
	public List<Responsable> getAllResponsable(){
	 	return responsableService.getAllResponsable();
	}
	
	@GetMapping("/allResponsables/ordered_by/prenoms")
	public List<Responsable> getAllResponsableOrderedByPrenom(){
		return responsableService.getAllResponsableOrderedByPrenom();
	}
	
	
	@GetMapping("/allResponsables/of/{prenom}/ordered_by/prenom")
	public List<Responsable> getAllResponsableOfPrenomOrderedByPrenom(@PathVariable String prenom){
		return responsableService.getAllResponsableOfPrenom(prenom);
	}

	@GetMapping("/allResponsables/of/{nom}/ordered_by/nom")
	public List<Responsable> getAllResponsableOfPrenomOrderedByNom(@PathVariable String nom){
		return responsableService.getAllResponsableOfNom(nom);
	}
	
	@GetMapping("/allResponsables/of/{nom}/{prenom}/ordered_by/prenom")
	public List<Responsable> getAllResponsableOfNomAndPrenom(@PathVariable String nom,  @PathVariable String prenom){
		return responsableService.getAllResponsableOfNomAndPrenom(nom, prenom);
	}
	
	
	@GetMapping("/Responsable/{id}")
	public Responsable getResponsableOfId(@PathVariable Long id) {
		return responsableService.getResponsableOfId(id);
	}
	
	@PostMapping("/add_Responsable")
	public void addResponsable(@RequestBody Responsable Responsable) {
		responsableService.addResponsable(Responsable);
	}
	
	@PutMapping("/update_Responsable/{id}")
	public void updateResponsable(@RequestBody Responsable Responsable, @PathVariable Long id) {
		responsableService.updateResponsable(Responsable);
	}
	
	@DeleteMapping("/delete_Responsables/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		responsableService.deleteByIdResponsable(id);
	}

}
