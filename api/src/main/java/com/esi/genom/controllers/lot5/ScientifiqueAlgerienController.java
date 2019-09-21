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

import com.esi.genom.entities.lot5.ScientifiqueAlgerien;
import com.esi.genom.services.lot5.ScientifiqueAlgerienService;


@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ScientifiqueAlgerienController {

	@Autowired
	private ScientifiqueAlgerienService scientifiqueAlgerienService;
	
	@GetMapping("/allScientifiqueAlgeriens")
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerien(){
	 	return scientifiqueAlgerienService.getAllScientifiqueAlgerien();
	}
	
	@GetMapping("/allScientifiqueAlgeriens/ordered_by/prenoms")
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOrderedByPrenom(){
		return scientifiqueAlgerienService.getAllScientifiqueAlgerienOrderedByPrenom();
	}
	
	
	@GetMapping("/allScientifiqueAlgeriens/of/{prenom}/ordered_by/prenom")
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOfPrenomOrderedByPrenom(@PathVariable String prenom){
		return scientifiqueAlgerienService.getAllScientifiqueAlgerienOfPrenom(prenom);
	}

	@GetMapping("/allScientifiqueAlgeriens/of/{nom}/ordered_by/nom")
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOfPrenomOrderedByNom(@PathVariable String nom){
		return scientifiqueAlgerienService.getAllScientifiqueAlgerienOfNom(nom);
	}
	
	@GetMapping("/allScientifiqueAlgeriens/of/{nom}/{prenom}/ordered_by/prenom")
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOfNomAndPrenom(@PathVariable String nom,  @PathVariable String prenom){
		return scientifiqueAlgerienService.getAllScientifiqueAlgerienOfNomAndPrenom(nom, prenom);
	}
	
	
	@GetMapping("/ScientifiqueAlgerien/{id}")
	public ScientifiqueAlgerien getScientifiqueAlgerienOfId(@PathVariable Long id) {
		return scientifiqueAlgerienService.getScientifiqueAlgerienOfId(id);
	}
	
	@PostMapping("/add_ScientifiqueAlgerien")
	public void addScientifiqueAlgerien(@RequestBody ScientifiqueAlgerien ScientifiqueAlgerien) {
		scientifiqueAlgerienService.addScientifiqueAlgerien(ScientifiqueAlgerien);
	}
	
	@PutMapping("/update_ScientifiqueAlgerien/{id}")
	public void updateScientifiqueAlgerien(@RequestBody ScientifiqueAlgerien ScientifiqueAlgerien, @PathVariable Long id) {
		scientifiqueAlgerienService.updateScientifiqueAlgerien(ScientifiqueAlgerien);
	}
	
	@DeleteMapping("/delete_ScientifiqueAlgeriens/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		scientifiqueAlgerienService.deleteByIdScientifiqueAlgerien(id);
	}
}
