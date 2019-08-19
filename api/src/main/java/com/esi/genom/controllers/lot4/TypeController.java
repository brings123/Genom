package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot4.Type;
import com.esi.genom.repositories.lot4.TypeRepository;
@RestController
public class TypeController {
	@Autowired
	TypeRepository typerepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/types")
	public List<Type> getAllClasses(){
		return typerepo.findAll();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/type/name/{name}")
    public List<Type> getResByName(@PathVariable String name) {
    	return typerepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/type/{id}")
	public Optional<Type> getResById(@PathVariable Integer id) {
	    return typerepo.findById(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/types")
    public void addClasses(@RequestBody List<Type> types) {
    	typerepo.saveAll(types);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/type")
    public void  addClasse(@RequestBody Type type) {
    	typerepo.save(type);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/type")
    public void updateClasse(@RequestBody Type type) {
    	typerepo.save(type);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/type/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	typerepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/type/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	typerepo.deleteByName(name);
    }  
}
