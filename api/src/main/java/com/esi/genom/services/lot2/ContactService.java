package com.esi.genom.services.lot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Contact;
import com.esi.genom.repository.lot2.ContactRepository;


@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact> getAllContact(){
		List<Contact> contacts = new ArrayList<>();
		
		contactRepository.findAll().forEach(contacts::add);
		return contacts;
	}
	
	/**
	 * Add new {@link Contact} to the database
	 * @param annonce 
	 */
	public void addcontact(Contact contact) {
		contactRepository.save(contact);
	}
	
	/**
	 * 
	 * @param id
	 * @return the contact of a specific id
	 */
	public Contact getContact(String id) {
		return contactRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateContact( Contact contact) {
		contactRepository.save(contact);
	}
	
	public void deleteContact(String id) {	
		contactRepository.deleteById(id);
	}

}
