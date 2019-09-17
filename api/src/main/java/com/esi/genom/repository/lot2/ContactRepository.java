package com.esi.genom.repository.lot2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot2.Contact;
import com.esi.genom.entities.lot2.Video;;

public interface ContactRepository extends CrudRepository<Contact,String> {
//	public List<Contact> findTop10ByOrderByDate_ajoutDesc(Date date_ajout);

}
