package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long>{
	
	public List<Zone> findByZone(String zone);
	public List<Zone> findByZone(String zone, Sort sort);
	
	public List<Zone> findByLangitude(Double langitude);
	public List<Zone> findByLangitude(Double langitude, Sort sort);
	
	
	public List<Zone> findByLatitude(Double latitude);
	public List<Zone> findByLatitude(Double latitude, Sort sort);
	
	
	public List<Zone> findByAltitude(Double altitude);
	public List<Zone> findByAltitude(Double altitude, Sort sort);
	
	public List<Zone> findByLangitudeAndLatitude(Double langitude, Double latitude);
	public List<Zone> findByLangitudeAndLatitude(Double langitude, Double latitude, Sort sort);
	
	public List<Zone> findByLangitudeAndLatitudeAndAltitude(Double langitude, Double latitude, Double altitude);
	public List<Zone> findByLangitudeAndLatitudeAndAltitude(Double langitude, Double latitude, Double altitude, Sort sort);

}
