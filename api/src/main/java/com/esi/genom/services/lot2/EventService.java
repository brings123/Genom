package com.esi.genom.services.lot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Events;
import com.esi.genom.repository.lot2.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	public List<Events> getAllEvents(){
		List<Events> events = new ArrayList<>();
		
		eventRepository.findAll().forEach(events::add);
		return events;
	}
	
	/**
	 * Add new documents to the database
	 * @param Events 
	 */
	public void addEvent(Events event) {
		eventRepository.save(event);
	}
	
	/**
	 * 
	 * @param id
	 * @return the document of a specific id
	 */
	public Events getEvent(Long id) {
		return eventRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateEvent(Events event) {
		eventRepository.save(event);
	}
	
	public void deleteEvent(Long id) {	
		eventRepository.deleteById(id);
	}
	
	/**
	 * 
	 * @param title
	 * @return
	 */
	public List<Events> getEventByTitle(String title){
		return eventRepository.findByTitre(title);
	}


}
