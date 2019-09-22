package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.Responsable;
import com.esi.genom.repositories.lot5.ResponsableRepository;

@Service
public class ResponsableService {
	
	@Autowired
	private ResponsableRepository reponsableRepository;
	private List<Responsable> responsables = new ArrayList<>();
	
	public List<Responsable> getAllResponsable(){
		reponsableRepository.findAll().forEach(responsables::add);
		return responsables;
	}

	
	public List<Responsable> getAllResponsableOrderedByPrenom(){
		reponsableRepository.findAll(Sort.by(Sort.Direction.ASC, "prenom")).forEach(responsables::add);
		return responsables;
	}
	
	public List<Responsable> getAllResponsableOrderedByNom(){
		reponsableRepository.findAll(Sort.by(Sort.Direction.ASC, "nom")).forEach(responsables::add);
		return responsables;
	}
	
	public List<Responsable> getAllResponsableOfPrenom(String prenom){
		reponsableRepository.findByPrenom(prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(responsables::add);
		return responsables;
	}
	
	public List<Responsable> getAllResponsableOfNom(String nom){
		reponsableRepository.findByPrenom(nom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(responsables::add);
		return responsables;
	}
	
	public List<Responsable> getAllResponsableOfNomAndPrenom(String nom, String prenom){
		reponsableRepository.findByNomAndPrenom(nom, prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(responsables::add);
		return responsables;
	}
	
	public Responsable getResponsableOfId(Long id) {
		return reponsableRepository.findById(id).get();
	}
	
	public void addResponsable(Responsable scientifiqueAlgerien) {
		reponsableRepository.save(scientifiqueAlgerien);
	}

	public void updateResponsable(Responsable scientifiqueAlgerien) {
		reponsableRepository.save(scientifiqueAlgerien);
	}
	
	public void deleteByIdResponsable(Long id) {
		reponsableRepository.deleteById(id);
	}

}
