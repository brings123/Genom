package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.Operateur;
import com.esi.genom.repositories.lot5.OperateurRepository;

@Service
public class OperateurService {
	
	@Autowired
	private OperateurRepository operateurRepository;
	private List<Operateur> operateurs = new ArrayList<>();
	
	public List<Operateur> getAllOperateur(){
		operateurRepository.findAll().forEach(operateurs::add);
		return operateurs;
	}

	
	public List<Operateur> getAllOperateurOrderedByPrenom(){
		operateurRepository.findAll(Sort.by(Sort.Direction.ASC, "prenom")).forEach(operateurs::add);
		return operateurs;
	}
	
	public List<Operateur> getAllOperateurOrderedByNom(){
		operateurRepository.findAll(Sort.by(Sort.Direction.ASC, "nom")).forEach(operateurs::add);
		return operateurs;
	}
	
	public List<Operateur> getAllOperateurOfPrenom(String prenom){
		operateurRepository.findByPrenom(prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(operateurs::add);
		return operateurs;
	}
	
	public List<Operateur> getAllOperateurOfNom(String nom){
		operateurRepository.findByPrenom(nom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(operateurs::add);
		return operateurs;
	}
	
	public List<Operateur> getAllOperateurOfNomAndPrenom(String nom, String prenom){
		operateurRepository.findByNomAndPrenom(nom, prenom, Sort.by(Sort.Direction.ASC, "prenom")).forEach(operateurs::add);
		return operateurs;
	}
	
	public Operateur getOperateurOfId(Long id) {
		return operateurRepository.findById(id).get();
	}
	
	public void addOperateur(Operateur scientifiqueAlgerien) {
		operateurRepository.save(scientifiqueAlgerien);
	}

	public void updateOperateur(Operateur scientifiqueAlgerien) {
		operateurRepository.save(scientifiqueAlgerien);
	}
	
	public void deleteByIdOperateur(Long id) {
		operateurRepository.deleteById(id);
	}

}
