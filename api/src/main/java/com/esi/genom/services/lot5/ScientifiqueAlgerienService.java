package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.ScientifiqueAlgerien;
import com.esi.genom.repositories.lot5.ScientifiqueAlgerienRepository;

@Service
public class ScientifiqueAlgerienService {
	
	@Autowired
	private ScientifiqueAlgerienRepository scientifiqueAlgerienRepository;
	private List<ScientifiqueAlgerien> scientifiquesAlgeriens = new ArrayList<>();
	
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerien(){
		scientifiqueAlgerienRepository.findAll().forEach(scientifiquesAlgeriens::add);
		return scientifiquesAlgeriens;
	}

	
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOrderedByPrenom(){
		scientifiqueAlgerienRepository.findAll(Sort.by(Sort.Direction.ASC, "prenom")).forEach(scientifiquesAlgeriens::add);
		return scientifiquesAlgeriens;
	}
	
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOrderedByNom(){
		scientifiqueAlgerienRepository.findAll(Sort.by(Sort.Direction.ASC, "nom")).forEach(scientifiquesAlgeriens::add);
		return scientifiquesAlgeriens;
	}
	
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOfPrenom(String prenom){
		scientifiqueAlgerienRepository.findByPrenom(prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(scientifiquesAlgeriens::add);
		return scientifiquesAlgeriens;
	}
	
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOfNom(String nom){
		scientifiqueAlgerienRepository.findByPrenom(nom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(scientifiquesAlgeriens::add);
		return scientifiquesAlgeriens;
	}
	
	public List<ScientifiqueAlgerien> getAllScientifiqueAlgerienOfNomAndPrenom(String nom, String prenom){
		scientifiqueAlgerienRepository.findByNomAndPrenom(nom, prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(scientifiquesAlgeriens::add);
		return scientifiquesAlgeriens;
	}
	
	public ScientifiqueAlgerien getScientifiqueAlgerienOfId(Long id) {
		return scientifiqueAlgerienRepository.findById(id).get();
	}
	
	public void addScientifiqueAlgerien(ScientifiqueAlgerien scientifiqueAlgerien) {
		scientifiqueAlgerienRepository.save(scientifiqueAlgerien);
	}

	public void updateScientifiqueAlgerien(ScientifiqueAlgerien scientifiqueAlgerien) {
		scientifiqueAlgerienRepository.save(scientifiqueAlgerien);
	}
	
	public void deleteByIdScientifiqueAlgerien(Long id) {
		scientifiqueAlgerienRepository.deleteById(id);
	}
}
