package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esi.genom.entities.lot4.Ressource;
import com.esi.genom.repositories.lot4.RessourceRepository;

public class RessourceController {
	@Autowired
	RessourceRepository ressrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/ressources")
	public List<Ressource> getAllClasses(){
		return ressrepo.findAll();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/ressource/name/{name}")
    public List<Ressource> getResByName(@PathVariable String name) {
    	return ressrepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/ressource/{id}")
	public Optional<Ressource> getResById(@PathVariable Integer id) {
	    return ressrepo.findById(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/ressources")
    public void addClasses(@RequestBody List<Ressource> ressources) {
    	ressrepo.saveAll(ressources);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/ressource")
    public void  addClasse(@RequestBody Ressource ressource) {
    	ressrepo.save(ressource);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/ressource")
    public void updateClasse(@RequestBody Ressource ressource) {
    	ressrepo.save(ressource);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/ressource/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	ressrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/ressource/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	ressrepo.deleteByName(name);
    }  
}
