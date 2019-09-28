package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Annonce;
import com.esi.genom.entities.lot2.Contact;
import com.esi.genom.entities.users.ApiResponse;
import com.esi.genom.entities.users.User;
import com.esi.genom.services.lot2.ContactService;
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

public class ContactController {
	@Autowired
	private ContactService contactService;
		
//	@RequestMapping("/contacts")
//	public List<Contact> getContacts(){
//		return contactService.getAllContact();
//	}
	 @RequestMapping(value="/contacts/all", method = RequestMethod.GET)
	    public ApiResponse<List<Contact>> getContacts(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Contacts list fetched successfully.",contactService.getAllContact());
	    }
	
	@RequestMapping("/contacts/{id}")
	public Contact getAnnonce(@PathVariable String id) {
		return contactService.getContact(id);

	}
	
	@RequestMapping(value = "contacts/new",method =RequestMethod.POST)
    public void addContact(@RequestBody Contact contact) {
		contactService.addcontact(contact);
	}	
	/**
	 * update contact
	 * @param contact
	 * @param id
	 */
	@RequestMapping(value="/contacts/update/{id}",method =RequestMethod.PUT)
    public void updateContact(@RequestBody Contact contact,@PathVariable Long id) {
		contactService.updateContact(contact);
	}	
	
	
	
	

}
