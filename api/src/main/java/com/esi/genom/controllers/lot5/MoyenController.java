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

import com.esi.genom.entities.lot5.Moyen;
import com.esi.genom.services.lot5.MoyenService;


@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class MoyenController {
	
	@Autowired
	private MoyenService moyenService;
	
	@GetMapping("/allmoyens")
	public List<Moyen> findAllMoyen(){
	 	return moyenService.findAllMoyen();
	}
	
	@GetMapping("/allmoyens/ordered_by/moyen")
	public List<Moyen> findAllMoyenOrderedByMoyen(){
		return moyenService.findAllMoyenOrderedByMoyen();
	}
	
	@GetMapping("/moyen/{id}")
	public Moyen findMoyenById(@PathVariable Long id) {
		return moyenService.findMoyenById(id);
	}
	
	@GetMapping("/moyen/{moyen}")
	public Moyen findMoyenByMoyen(@PathVariable String moyen) {
		return moyenService.findMoyenByMoyen(moyen);
	}
	
	/*
	 * @GetMapping("/moyen/{moyen}") public Moyen
	 * findMoyenByTypeOrderedByMoyen(@PathVariable String moyen) { return
	 * moyenService.findMoyenByTypeOrderedByMoyen(moyen); }
	 */
	
	@PostMapping("/add_moyen")
	public void addMoyen(@RequestBody Moyen moyen) {
		moyenService.addMoyen(moyen);
	}
	
	@PutMapping("/update_moyen/{id}")
	public void updateMoyen(@RequestBody Moyen moyen, @PathVariable Long id) {
		moyenService.updateMoyen(moyen);
	}
	
	@DeleteMapping("/delete_moyen/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		moyenService.deleteMoyenById(id);
	}
	
	@DeleteMapping("/delete_moyen/{moyen}")
	public void deleteDocumentByMoyen(@PathVariable String moyen) {
		moyenService.deleteMoyenByMoyen(moyen);
	}

}
