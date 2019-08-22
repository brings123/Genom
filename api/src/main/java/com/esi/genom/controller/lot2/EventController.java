package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Events;
import com.esi.genom.services.lot2.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	
	@RequestMapping(method= RequestMethod.GET,value ="/events/all")
	public List<Events> getAllEvents(){
		return eventService.getAllEvents();
	}
	
	@RequestMapping(method = RequestMethod.GET,value ="/events/{id}")
	public Events getEvent(@PathVariable Long id) {
		return eventService.getEvent(id);

	}
	
	
	
	
	@RequestMapping(value="/events",method =RequestMethod.POST)
    public void addEvent(@RequestBody Events event) {
		eventService.addEvent(event);
	}	
	
	/**
	 * UPDATE ANNOUNCE
	 * @param annonce
	 * @param id
	 */
	
	@RequestMapping(value="/events/update/{id}",method =RequestMethod.PUT)
    public void updateEvent(@RequestBody Events event,@PathVariable Long id) {
		eventService.updateEvent(event);
	}	
	
	/**
	 * 
	 * @param titre
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/events/titre/{titre}")
    public List<Events> getEventByTitre(@PathVariable String titre) {
		return eventService.getEventByTitle(titre);
	 }
	
	
	
	

}
