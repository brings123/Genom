package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.Detenteur;
import com.esi.genom.repositories.lot5.DetenteurRepository;

@Service
public class DetenteurService {
	
	@Autowired
	private DetenteurRepository detenteurRepository;
	private List<Detenteur> detenteurs = new ArrayList<>();

	
	public List<Detenteur> getAllDetenteur(){
		detenteurRepository.findAll().forEach(detenteurs::add);
		return detenteurs;
	}

	
	public List<Detenteur> getAllDetenteurOrderedByPrenom(){
		detenteurRepository.findAll(Sort.by(Sort.Direction.ASC, "prenom")).forEach(detenteurs::add);
		return detenteurs;
	}
	
	public List<Detenteur> getAllDetenteurOrderedByNom(){
		detenteurRepository.findAll(Sort.by(Sort.Direction.ASC, "nom")).forEach(detenteurs::add);
		return detenteurs;
	}
	
	public List<Detenteur> getAllDetenteurOfPrenom(String prenom){
		detenteurRepository.findByPrenom(prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(detenteurs::add);
		return detenteurs;
	}
	
	public List<Detenteur> getAllDetenteurOfNom(String nom){
		detenteurRepository.findByPrenom(nom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(detenteurs::add);
		return detenteurs;
	}
	
	public List<Detenteur> getAllDetenteurOfNomAndPrenom(String nom, String prenom){
		detenteurRepository.findByNomAndPrenom(nom, prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(detenteurs::add);
		return detenteurs;
	}
	
	public Detenteur getDetenteurOfId(Long id) {
		return detenteurRepository.findById(id).get();
	}
	
	public void addDetenteur(Detenteur scientifiqueAlgerien) {
		detenteurRepository.save(scientifiqueAlgerien);
	}

	public void updateDetenteur(Detenteur scientifiqueAlgerien) {
		detenteurRepository.save(scientifiqueAlgerien);
	}
	
	public void deleteByIdDetenteur(Long id) {
		detenteurRepository.deleteById(id);
	}
}
