package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.esi.genom.entities.lot5.Zone;
import com.esi.genom.repositories.lot5.ZoneRepository;

@Service
public class ZoneService {
	
	@Autowired
	private ZoneRepository zoneRepository;
	private List<Zone> zones = new ArrayList<>();

	public List<Zone> getAllZone(){
		zoneRepository.findAll().forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOrderdByZone(){
		zoneRepository.findAll(Sort.by(Sort.Direction.DESC, "zone")).forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOrderdByLangitude(){
		zoneRepository.findAll(Sort.by(Sort.Direction.DESC, "langitude")).forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOrderdByLatitude(){
		zoneRepository.findAll(Sort.by(Sort.Direction.DESC, "latitude")).forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOfZoneOrderedByZone(String zone){
		zoneRepository.findByZone(zone, Sort.by(Sort.Direction.DESC,"zone" )).forEach(zones::add);
		return zones;
	}
	
	
	public List<Zone> getAllZoneOfLangitudeOrderedByLangitude(Double langitude){
		zoneRepository.findByLangitude(langitude, Sort.by(Sort.Direction.DESC,"langitude" )).forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOfLatitudeOrderedByLatitude(Double latitude){
		zoneRepository.findByLatitude(latitude, Sort.by(Sort.Direction.DESC,"latitude" )).forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOfAltitudeOrderedByAltitude(Double altitude){
		zoneRepository.findByAltitude(altitude, Sort.by(Sort.Direction.DESC,"altitude" )).forEach(zones::add);
		return zones;
	}
	
	public List<Zone> getAllZoneOfLangitudeAndLatitudeOrderedByLangitudeDes(Double langitude, Double latitude){
		zoneRepository.findByLangitudeAndLatitude(langitude, latitude, Sort.by(Sort.Direction.DESC,"langitude" )).forEach(zones::add);
		return zones;
	}
	
	public void addZone(Zone zone) {
		zoneRepository.save(zone);
	}
	
	public void updateZone(Zone zone) {
		zoneRepository.save(zone);
	}
	
	public void deleteZoneById(Long id) {
		zoneRepository.deleteById(id);
	}
}
