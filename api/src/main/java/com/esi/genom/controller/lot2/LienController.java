package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Lien;
import com.esi.genom.services.lot2.LienService;

@RestController
public class LienController {
	@Autowired
	private LienService lienService;
	
	@RequestMapping("/Liens")
	public List<Lien> getAllLien(){
		return lienService.getAllLiens();
	}
	
	@RequestMapping("/Liens/{id}")
	public Lien getLien(@PathVariable Long id) {
		return lienService.getLien(id);

	}
	/**
	@RequestMapping(method =RequestMethod.POST)
    public void addLien(@RequestBody Lien lien) {
		lienService.addLien(lien);
	}	*/
}
