package com.esi.genom.controllers.lot4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.repositories.lot4.ValeurRepository;

import javassist.NotFoundException;

import com.esi.genom.entities.lot4.Valeur;



@RestController
public class ValeurController {
	@Autowired
	ValeurRepository valrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/valeurs")
	public List<Valeur> getAllClasses(){
		return valrepo.findAll();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/valeur/name/{name}")
    public List<Valeur> getResByName(@PathVariable String name) {
    	return valrepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/valeur/{id}")
	public Optional<Valeur> getResById(@PathVariable Integer id) {
	    return valrepo.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/valeur/Caracteristique/{id}")
	public List<Valeur> getResByCar(@PathVariable Integer id) {
	    return valrepo.findByCaracteristiqueId(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/valeur/Ressource/{id}")
	public List<Valeur> getResByRes(@PathVariable Integer id) {
	    return valrepo.findByRessourceId(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/valeurs")
    public void addClasses(@RequestBody List<Valeur> valeurs) {
    	valrepo.saveAll(valeurs);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/valeur")
    public Valeur  addClasse(@RequestBody Valeur valeur) {
    	valrepo.save(valeur);
    	return valeur;
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/valeur")
    public void updateClasse(@RequestBody Valeur valeur) {
    	valrepo.save(valeur);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/valeur/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	valrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/valeur/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	valrepo.deleteByName(name);
    }  
}
