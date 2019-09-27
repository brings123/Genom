package com.esi.genom.controllers.lot3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot3.Institut;
import com.esi.genom.services.lot3.InstitutService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class InstitutController {
	@Autowired
	private InstitutService InstitutService;
	
	@RequestMapping(method= RequestMethod.GET,value ="/Institutions")
	public List<Institut> getAllInstituts(){
		return InstitutService.getAllInstituts();
	}
	
	@RequestMapping(method = RequestMethod.GET,value ="/Institutions/{id}")
	public Institut getInstitut(@PathVariable Long id) {
		return InstitutService.getInstitut(id);
	}	
	
	@RequestMapping(value = "/Institutions/new",method =RequestMethod.POST)
    public void addInstitut(@RequestBody Institut Institut) {
		InstitutService.addInstitut(Institut);
	}
	
	
}