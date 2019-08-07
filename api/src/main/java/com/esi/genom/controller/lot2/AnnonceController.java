package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Annonce;
import com.esi.genom.services.lot2.AnnonceService;

@RestController
public class AnnonceController {
	
	@Autowired
	private AnnonceService annonceService;
	
	@RequestMapping("/annonces")
	public List<Annonce> getAllAnnonce(){
		return annonceService.getAllAnnonce();
	}
	
	@RequestMapping("/annonces/{id}")
	public Annonce getAnnonce(@PathVariable Long id) {
		return annonceService.getAnnonce(id);

	}
	@RequestMapping(method =RequestMethod.POST)
    public void addAnnonce(@RequestBody Annonce annonce) {
		annonceService.addAnnonce(annonce);
	}	
	
	 

}
