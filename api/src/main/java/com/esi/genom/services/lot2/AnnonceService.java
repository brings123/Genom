package com.esi.genom.services.lot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Annonce;
import com.esi.genom.repository.lot2.AnnonceRepository;


@Service 	
public class AnnonceService {
	@Autowired
	private AnnonceRepository annonceRepository;
	
	public List<Annonce> getAllAnnonce(){
		List<Annonce> annonces = new ArrayList<>();
		
		annonceRepository.findAll().forEach(annonces::add);
		return annonces;
	}
	
	/**
	 * Add new annonce to the database
	 * @param annonce 
	 */
	public void addAnnonce(Annonce annonce) {
		annonceRepository.save(annonce);
	}
	
	/**
	 * 
	 * @param id
	 * @return the annonce of a specific id
	 */
	public Annonce getAnnonce(Long id) {
		return annonceRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateAnnonce(Annonce annonce) {
		annonceRepository.save(annonce);
	}
	
	public void deleteAnnonce(Long id) {	
		annonceRepository.deleteById(id);
	}
	
//	public List<Annonce> getTop10ByDate(){
//		return annonceRepository.findTop10ByOrderByDate_ajoutDesc();
//	}
	
	public List<Annonce> getAnnoncesByTitle(String titre){
		return annonceRepository.findByTitre(titre);
	}
	

}
