package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot4.Localisation;
import com.esi.genom.entities.lot4.Ressource;
import com.esi.genom.repositories.lot4.LocalisationRepository;
import com.esi.genom.repositories.lot4.RessourceRepository;
@RestController
public class LocalisationController {
	@Autowired
	LocalisationRepository locarepo;
	@Autowired
	RessourceRepository resrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/localisations")
	public List<Localisation> getAllClasses(){
		return locarepo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/localisation/{id}")
	public Optional<Localisation> getResById(@PathVariable Integer id) {
	    return locarepo.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/localisation/ressource/{id}")
	public List<Localisation> getRes(@PathVariable Integer id) {
		return locarepo.findByRessourceId(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/localisations")
    public void addClasses(@RequestBody List<Localisation> localisations) {
    	locarepo.saveAll(localisations);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/localisation")
    public void  addClasse(@RequestBody Localisation localisation) {
    	locarepo.save(localisation);
    }
 
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/localisation")
    public void updateClasse(@RequestBody Localisation localisation) {
    	locarepo.save(localisation);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/localisation/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	locarepo.deleteById(id);
    	}
 
}
