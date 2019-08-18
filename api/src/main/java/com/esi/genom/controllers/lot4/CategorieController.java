package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esi.genom.entities.lot4.Categorie;
import com.esi.genom.repositories.lot4.CategorieRepository;

public class CategorieController {
	@Autowired
	CategorieRepository catrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/categories")
	public List<Categorie> getAllClasses(){
		return catrepo.findAll();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/categorie/name/{name}")
    public List<Categorie> getResByName(@PathVariable String name) {
    	return catrepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/categorie/{id}")
	public Optional<Categorie> getResById(@PathVariable Integer id) {
	    return catrepo.findById(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/categories")
    public void addClasses(@RequestBody List<Categorie> categories) {
    	catrepo.saveAll(categories);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/categorie")
    public void  addClasse(@RequestBody Categorie categorie) {
    	catrepo.save(categorie);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/categorie")
    public void updateClasse(@RequestBody Categorie categorie) {
    	catrepo.save(categorie);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/categorie/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	catrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/categorie/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	catrepo.deleteByName(name);
    }  
}
