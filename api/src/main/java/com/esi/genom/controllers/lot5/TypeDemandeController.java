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

import com.esi.genom.entities.lot5.TypeDemande;
import com.esi.genom.services.lot5.TypeDemandeService;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TypeDemandeController {
	
	@Autowired
	private TypeDemandeService typeService;
	
	@GetMapping("/alltypesdemandes")
	public List<TypeDemande> getAllTypeDemande(){
	 	return typeService.getAllTypeDemande();
	}
	
	@GetMapping("/alltypesdemandes/ordered_by/type")
	public List<TypeDemande> getAllTypeDemandeOrderedByType(){
	 	return typeService.getAllTypeDemandeOrderedByType();
	}

	@GetMapping("/typedemande/{id}")
	public TypeDemande getTypeDemandeById(@PathVariable Long id){
	 	return typeService.getTypeDemandeById(id);
	}
	
	
	@GetMapping("/typedemande/{type}")
	public TypeDemande getTypeDemandeByType(@PathVariable String type){
	 	return typeService.getTypeDemandeByType(type);
	}
	
	@PostMapping("/add_type_demande")
	public void addTypeDemande(@RequestBody TypeDemande type) {
		typeService.addTypeDemande(type);
	}
	
	
	@PutMapping("/add_type_demande/{id}")
	public void updateTypeDemande(@RequestBody TypeDemande type, @PathVariable Long id) {
		typeService.updateTypeDemande(type);
	}
	
	@DeleteMapping("/delete_type_demande/{id}")
	public void deleteTypeDemandeById(@PathVariable Long id) {
		typeService.deleteTypeDemandeById(id);
	}
}
