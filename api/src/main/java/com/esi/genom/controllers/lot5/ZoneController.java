package com.esi.genom.controllers.lot5;

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
import com.esi.genom.entities.lot5.Zone;
import com.esi.genom.services.lot5.ZoneService;

@RestController
@RequestMapping("/lot5")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ZoneController {
	
	@Autowired
	private ZoneService zonesService;
	
	@GetMapping("/allzones")
	public List<Zone> getAllZone(){
	 	return zonesService.getAllZone();
	}
	
	@GetMapping("/allzones/ordered_by/zone")
	public List<Zone> getAllZoneOrderdByZone(){
		return zonesService.getAllZoneOrderdByZone();
	}
	
	@GetMapping("/allzones/ordered_by/langitude")
	public List<Zone> getAllZoneOrderdByLangitude(){
		return zonesService.getAllZoneOrderdByLangitude();
	}
	
	@GetMapping("/allzones/ordered_by/latitude")
	public List<Zone> getAllZoneOrderdByLatitude(){
		return zonesService.getAllZoneOrderdByLangitude();
	}
	
	@GetMapping("/allzones/of/{zone}/ordered_by/zone")
	public List<Zone> getAllZoneOfZoneOrderedByZone(@PathVariable String zone){
		return zonesService.getAllZoneOfZoneOrderedByZone(zone);
	}

	@GetMapping("/allzones/of/{langitude}/ordered_by/langitude")
	public List<Zone> getAllZoneOfLangitudeOrderedByLangitude(@PathVariable Double langitude){
		return zonesService.getAllZoneOfLangitudeOrderedByLangitude(langitude);
	}
	
	@GetMapping("/allzones/of/{latitude}/ordered_by/latitude")
	public List<Zone> getAllZoneOfLatitudeOrderedByLatitude(@PathVariable Double latitude){
		return zonesService.getAllZoneOfLatitudeOrderedByLatitude(latitude);
	}
	
	@GetMapping("/allzones/of/{altitude}/ordered_by/altitude")
	public List<Zone> getAllZoneOfAltitudeOrderedByAltitude(@PathVariable Double altitude){
		return zonesService.getAllZoneOfAltitudeOrderedByAltitude(altitude);
	}
	
	@GetMapping("/allzones/of/{langitude}/and/{latitude}/ordered_by/langitude")
	public List<Zone> getAllZoneOfLangitudeAndLatitudeOrderedByLangitudeDes(@PathVariable Double langitude, @PathVariable Double latitude){
		return zonesService.getAllZoneOfLangitudeAndLatitudeOrderedByLangitudeDes(langitude, latitude);
	}
	
	@GetMapping("/zone/{id}")
	public Zone getZoneById(@PathVariable Long id) {
		return zonesService.getZoneById(id);
	}
	
	@PostMapping("/add_zone")
	public void addZone(@RequestBody Zone zone) {
		zonesService.addZone(zone);
	}
	
	@PutMapping("/update_zone/{id}")
	public void updateZone(@RequestBody Zone zone, @PathVariable Long id) {
		zonesService.updateZone(zone);
	}
	
	@DeleteMapping("/delete_zone/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		zonesService.deleteZoneById(id);
	}
}
