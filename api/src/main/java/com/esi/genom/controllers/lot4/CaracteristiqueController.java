package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esi.genom.entities.lot4.Caracteristique;
import com.esi.genom.repositories.lot4.CaracteristiqueRepository;

public class CaracteristiqueController {
	@Autowired
	CaracteristiqueRepository catrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/caracteristiques")
	public List<Caracteristique> getAllClasses(){
		return catrepo.findAll();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/caracteristique/name/{name}")
    public List<Caracteristique> getResByName(@PathVariable String name) {
    	return catrepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/caracteristique/{id}")
	public Optional<Caracteristique> getResById(@PathVariable Integer id) {
	    return catrepo.findById(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/caracteristiques")
    public void addClasses(@RequestBody List<Caracteristique> caracteristiques) {
    	catrepo.saveAll(caracteristiques);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/caracteristique")
    public void  addClasse(@RequestBody Caracteristique caracteristique) {
    	catrepo.save(caracteristique);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/caracteristique")
    public void updateClasse(@RequestBody Caracteristique caracteristique) {
    	catrepo.save(caracteristique);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/caracteristique/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	catrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/caracteristique/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	catrepo.deleteByName(name);
    }  
}
