package com.esi.genom.controllers.lot4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot4.Images;
import com.esi.genom.repositories.lot4.ImagesRepository;
@RestController
public class ImagesController {
	@Autowired
	ImagesRepository imagrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="/images")
	public List<Images> getAllClasses(){
		return imagrepo.findAll();
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/image/{id}")
	public Optional<Images> getResById(@PathVariable Integer id) {
	    return imagrepo.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/image/ressource/{id}")
	public List<Images> getResByRes(@PathVariable Integer id) {
	    return imagrepo.findByRessourceId(id);
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/images")
    public void addClasses(@RequestBody List<Images> images) {
    	imagrepo.saveAll(images);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/image")
    public void  addClasse(@RequestBody Images image) {
    	imagrepo.save(image);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/image")
    public void updateClasse(@RequestBody Images image) {
    	imagrepo.save(image);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/image/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	imagrepo.deleteById(id);
    	}

}
