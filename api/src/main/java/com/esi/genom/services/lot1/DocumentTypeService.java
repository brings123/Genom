package com.esi.genom.services.lot1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.repositories.lot1.DocumentTypeRepository;
import com.esi.genom.entities.lot1.DocumentType;

@Service
public class DocumentTypeService {
	
	@Autowired
	private DocumentTypeRepository documentTypeRepository;
	private List<DocumentType> documentTypes = new ArrayList<> ();
	
	public List<DocumentType> getAllDocumentTypes() {
		documentTypeRepository.findAll().forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypesOrderedByNomTypeDocument() {
		documentTypeRepository.findAll(Sort.by(Sort.Direction.ASC, "nomTypeDocument")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypesOrderedByTypeDocumentDateCreation() {
		documentTypeRepository.findAll(Sort.by(Sort.Direction.DESC, "typeDocumentDateCreation")).forEach(documentTypes::add);
		return documentTypes;
	}

	public List<DocumentType> getAllDocumentTypesCreatedIn(Date date){
		documentTypeRepository.findByTypeDocumentDateCreation(date).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypesCreatedInOrderedByNomTypeDocument(Date date){
		documentTypeRepository.findByTypeDocumentDateCreation(date, Sort.by(Sort.Direction.ASC, "nomTypeDocument")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypesCreatedInOrderedByTypeDocumentDateCreation(Date date){
		documentTypeRepository.findByTypeDocumentDateCreation(date, Sort.by(Sort.Direction.DESC, "typeDocumentDateCreation")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypeCreatedBy(Long userId){
		documentTypeRepository.findByCreateurTypeDocumentId(userId).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypesCreatedByOrderedByNomTypeDocument(Long userId){
		documentTypeRepository.findByCreateurTypeDocumentId(userId, Sort.by(Sort.Direction.ASC, "nomTypeDocument")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypeCreatedByOrderedByTypeDocumentDateCreation(Long userId){
		documentTypeRepository.findByCreateurTypeDocumentId(userId, Sort.by(Sort.Direction.DESC, "typeDocumentDateCreation")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypeCreatedBy(String userName){
		documentTypeRepository.findByCreateurTypeDocumentUsername(userName).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypesCreatedByOrderedByNomTypeDocument(String userName){
		documentTypeRepository.findByCreateurTypeDocumentUsername(userName, Sort.by(Sort.Direction.ASC, "nomTypeDocument")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public List<DocumentType> getAllDocumentTypeCreatedByOrderedByTypeDocumentDateCreation(String userName){
		documentTypeRepository.findByCreateurTypeDocumentUsername(userName, Sort.by(Sort.Direction.DESC, "typeDocumentDateCreation")).forEach(documentTypes::add);
		return documentTypes;
	}
	
	public DocumentType getDocumentTypeById(Long typeId) {
		return documentTypeRepository.findById(typeId).get();
	}
	
	public DocumentType getDocumentTypeByDocumentType(String documentType) {
		return documentTypeRepository.findByNomTypeDocument(documentType);
	}
	
	public void addDocumentType(DocumentType documentType) {
		documentTypeRepository.save(documentType);
	}
	
	public void updateDocumentType(DocumentType documentType) {
		documentTypeRepository.save(documentType);
	}
	
	public void deleteDocumentTypeById(Long id) {
		documentTypeRepository.deleteById(id);
	}
	
	public void deleteDocumentTypeByNomTypeDocument(String nomTypeDocument) {
		documentTypeRepository.deleteByNomTypeDocument(nomTypeDocument);
	}	
}
