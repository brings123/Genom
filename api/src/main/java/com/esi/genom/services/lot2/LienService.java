package com.esi.genom.services.lot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Document;
import com.esi.genom.entities.lot2.Lien;
import com.esi.genom.repository.lot2.LienRepository;

@Service
public class LienService {
	@Autowired
	private LienRepository lienRepository;
	
	public List<Lien> getAllLiens(){
		List<Lien> liens = new ArrayList<>();
		
		lienRepository.findAll().forEach(liens::add);
		return liens;
	}
	
	/**
	 * Add new documents to the database
	 * @param annonce 
	 */
	public void addLien(Lien lien) {
		lienRepository.save(lien);
	}
	
	/**
	 * 
	 * @param id
	 * @return the document of a specific id
	 */
	public Lien getLien(Long id) {
		return lienRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateLien(Long id, Document document) {
		
	}
	
	public void deleteLien(Long id) {	
		lienRepository.deleteById(id);
	}


}
