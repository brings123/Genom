package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.Demandeur;
import com.esi.genom.repositories.lot5.DemandeurRepository;

@Service
public class DemandeurService {
	
	@Autowired
	private DemandeurRepository demandeurRepository;
	private List<Demandeur> demandeurs = new ArrayList<>();

	
	public List<Demandeur> getAllDemandeur(){
		demandeurRepository.findAll().forEach(demandeurs::add);
		return demandeurs;
	}

	
	public List<Demandeur> getAllDemandeurOrderedByPrenom(){
		demandeurRepository.findAll(Sort.by(Sort.Direction.ASC, "prenom")).forEach(demandeurs::add);
		return demandeurs;
	}
	
	public List<Demandeur> getAllDemandeurOrderedByNom(){
		demandeurRepository.findAll(Sort.by(Sort.Direction.ASC, "nom")).forEach(demandeurs::add);
		return demandeurs;
	}
	
	public List<Demandeur> getAllDemandeurOfPrenom(String prenom){
		demandeurRepository.findByPrenom(prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(demandeurs::add);
		return demandeurs;
	}
	
	public List<Demandeur> getAllDemandeurOfNom(String nom){
		demandeurRepository.findByPrenom(nom, Sort.by(Sort.Direction.ASC, "nom")).forEach(demandeurs::add);
		return demandeurs;
	}
	
	public List<Demandeur> getAllDemandeurOfNomAndPrenom(String nom, String prenom){
		demandeurRepository.findByNomAndPrenom(nom, prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(demandeurs::add);
		return demandeurs;
	}
	
	public Demandeur getDemandeurOfId(Long id) {
		return demandeurRepository.findById(id).get();
	}
	
	public void addDemandeur(Demandeur scientifiqueAlgerien) {
		demandeurRepository.save(scientifiqueAlgerien);
	}

	public void updateDemandeur(Demandeur scientifiqueAlgerien) {
		demandeurRepository.save(scientifiqueAlgerien);
	}
	
	public void deleteByIdDemandeur(Long id) {
		demandeurRepository.deleteById(id);
	}

}
