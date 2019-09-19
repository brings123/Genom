package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.TypeDemande;
import com.esi.genom.repositories.lot5.TypeDemandeRepository;

@Service
public class TypeDemandeService {
	
	@Autowired
	private TypeDemandeRepository typeDocumentRepository;
	private List<TypeDemande> types = new ArrayList<>();
	
	public List<TypeDemande> getAllTypeDemande(){
		typeDocumentRepository.findAll().forEach(types::add);
		return types;
	}
	
	public List<TypeDemande> getAllTypeDemandeOrderedByType(){
		typeDocumentRepository.findAll(Sort.by(Sort.Direction.ASC, "type")).forEach(types::add);
		return types;
	}
	
	public TypeDemande getTypeDemandeById(Long id) {
		return typeDocumentRepository.findById(id).get();
	}
	
	public TypeDemande getTypeDemandeByType(String type) {
		return typeDocumentRepository.findByType(type);
	}

	public void addTypeDemande(TypeDemande typeDemande) {
		typeDocumentRepository.save(typeDemande);
	}
	
	public void updateTypeDemande(TypeDemande typeDemande) {
		typeDocumentRepository.save(typeDemande);
	}
	
	public void deleteTypeDemandeById(Long id) {
		typeDocumentRepository.deleteById(id);
	}
	
	public void deleteTypeDemandeByType(String type) {
		typeDocumentRepository.deleteByType(type);
	}
}
