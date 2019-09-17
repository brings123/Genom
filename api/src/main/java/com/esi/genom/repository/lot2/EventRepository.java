package com.esi.genom.repository.lot2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot2.Events;



public interface EventRepository extends CrudRepository<Events,Long> {
	public List<Events> findByTitre(String titre);



}
