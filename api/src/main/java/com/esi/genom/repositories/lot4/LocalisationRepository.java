package com.esi.genom.repositories.lot4;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esi.genom.entities.lot4.Localisation;

public interface LocalisationRepository extends JpaRepository<Localisation,Integer> {
	
	public List<Localisation> findByRessourceId(Integer id);
}
