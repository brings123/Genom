package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.esi.genom.entities.lot2.Contact;
import com.esi.genom.services.lot2.ContactService;
@RestController
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contacts")
	public List<Contact> getContacts(){
		return contactService.getAllContact();
	}
	
	@RequestMapping("/contatcts/{id}")
	public Contact getAnnonce(@PathVariable String id) {
		return contactService.getContact(id);

	}
	@RequestMapping(method =RequestMethod.POST)
    public void addAnnonce(@RequestBody Contact contact) {
		contactService.addcontact(contact);
	}	
	

}
