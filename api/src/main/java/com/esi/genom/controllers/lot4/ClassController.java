package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot4.Class;
import com.esi.genom.repositories.lot4.ClassRepository;
@RestController
public class ClassController {
	@Autowired
	ClassRepository classrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/classes")
	public List<Class> getAllClasses(){
		return classrepo.findAll();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/classe/name/{name}")
    public List<Class> getResByName(@PathVariable String name) {
    	return classrepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/classe/{id}")
	public Optional<Class> getResById(@PathVariable Integer id) {
	    return classrepo.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/classe/categorie/{id}")
	public List<Class> getResByCat(@PathVariable Integer id) {
	    return classrepo.findByCategorieId(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/classes")
    public void addClasses(@RequestBody List<Class> classes) {
    	classrepo.saveAll(classes);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/classe")
    public void  addClasse(@RequestBody Class classe) {
    	classrepo.save(classe);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/classe")
    public void updateClasse(@RequestBody Class classe) {
    	classrepo.save(classe);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/classe/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	classrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/classe/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	classrepo.deleteByName(name);
    }  
}
