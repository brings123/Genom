package com.esi.genom.controllers.lot5;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esi.genom.entities.lot5.Accords;
import com.esi.genom.services.lot5.AccordsService;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AccordsController {
	
	@Autowired
	private AccordsService accordsService;
	
	
	@GetMapping("/allaccords")
	public List<Accords> getAllAccords(){
		return accordsService.getAllAccords();
	}
	
	@GetMapping("/allaccords/ordered_by/date_accord")
	public List<Accords> getAllAccordsOrderedByDateAccord(){
		return accordsService.getAllAccordsOrderedByDateAccord();
	}

	
	@GetMapping("/accord/{id}")
	public Accords getAccordsById (@PathVariable("id") Long id){
		return accordsService.getAccordsById(id);
	}
	
	@GetMapping("/allaccords/chemin/{chemin}")
	public List<Accords> getAllAccordsOfCheminAccord (@PathVariable("chemin") String chemin){
		return accordsService.getAllAccordsOfCheminAccord(chemin);
	}
	
	@GetMapping("/allaccords/date_accord/ordered_by/date_accord/{dateAccord}")
	public List<Accords> findByDateAccordOrderedByDateAccord(@PathVariable Date dateAccord){
		return accordsService.findByDateAccordOrderedByDateAccord(dateAccord);
	}
	
	@GetMapping("/allaccords/source_accord/ordered_by/sourceAccord/{sourceAccord}")
	public List<Accords> findBySourceAccord(@PathVariable String sourceAccord){
		return accordsService.findBySourceAccord(sourceAccord);
	}
	
	@PostMapping("/add_accord")
	public void addAccords(@RequestBody Accords accord) {
		accordsService.addAccords(accord);
	}
	
	@PutMapping("/update_accord/{id}")
	public void addAccords(@RequestBody Accords accord, @PathVariable Long id ) {
		accordsService.addAccords(accord);
	}
	
	@DeleteMapping("/delete_accord/{id}")
	public void deleteById(@PathVariable Long id) {
		accordsService.deleteById(id);
	}
}
