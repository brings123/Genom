package com.esi.genom.services.lot1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot1.Document;
import com.esi.genom.repositories.lot1.DocumentsRepository;

@Service
public class DocumentsService {

	@Autowired
	private DocumentsRepository documentsRepository;
	private List<Document> documents = new ArrayList<>();
	
	//trouver tous les documents qui existent
	public List<Document> getAllDocuments() {
		documentsRepository.findAll().forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents qui existent ordonnées par la dernière date de modification
	public List<Document> getAllDocumentsOrderedByModificationDate() {
		documentsRepository.findAll(Sort.by(Sort.Direction.DESC, "documentDateModification")).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents qui existent ordonnées par la dernière date de création
	public List<Document> getAllDocumentsOrderedByCreationDate() {
		documentsRepository.findAll(Sort.by(Sort.Direction.DESC, "documentDateCreation")).forEach(documents::add);
		return documents;
	}
	
	public List<Document> getAllDocumentsOrderedByNomDocument() {
		documentsRepository.findAll(Sort.by(Sort.Direction.ASC, "nomDocument")).forEach(documents::add);
		return documents;
	}
	//trouver tous les documents tq id_type_document = typeId
	/*
	 * public List<Document> getAllDocumentsOfType(Long typeId){
	 * documentsRepository.findByDocumentTypeId(typeId).forEach(documents::add);
	 * return documents; }
	 * 
	 * //trouver tous les documents tq id_type_document = typeId ordonnées par la
	 * dernière date de modification public List<Document>
	 * getAllDocumentsOfTypeOrderedByModificationDate(Long typeId){
	 * documentsRepository.findByDocumentTypeId(typeId,
	 * Sort.by(Sort.Direction.DESC,"documentDateModification"
	 * )).forEach(documents::add); return documents; }
	 * 
	 * //trouver tous les documents tq id_type_document = typeId ordonnées par la
	 * dernière date de création public List<Document>
	 * getAllDocumentsOfTypeOrderedByCreationDate(Long typeId){
	 * documentsRepository.findByDocumentTypeId(typeId,
	 * Sort.by(Sort.Direction.DESC,"documentDateCreation"
	 * )).forEach(documents::add); return documents; }
	 * 
	 * public List<Document> getAllDocumentsOfTypeOrderedByDocumentName(Long
	 * typeId){ documentsRepository.findByDocumentTypeId(typeId,
	 * Sort.by(Sort.Direction.ASC,"nomDocument" )).forEach(documents::add); return
	 * documents; }
	 */

	//trouver tous les documents tq type_document = type
	public List<Document> getAllDocumentsOfType(String type){
		documentsRepository.findByDocumentType(type).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq type_document = type ordonnées par la dernière date de modification
	public List<Document> getAllDocumentsOfTypeOrderedByModificationDate(String type){
		documentsRepository.findByDocumentType(type, Sort.by(Sort.Direction.DESC,"documentDateModification" )).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq type_document = type ordonnées par la dernière date de création
	public List<Document> getAllDocumentsOfTypeOrderedByCreationDate(String type){
		documentsRepository.findByDocumentType(type, Sort.by(Sort.Direction.DESC,"documentDateCreation" )).forEach(documents::add);
		return documents;
	}
	
	public List<Document> getAllDocumentsOfTypeOrderedByDocumentName(String type){
		documentsRepository.findByDocumentType(type, Sort.by(Sort.Direction.ASC,"nomDocument" )).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq createur = user
	public List<Document> getAllDocumentsCreatedByUser(String userName){
		documentsRepository.findByCreateurDocumentUsername(userName).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq createur = user ordonnées par la dernière date de modification
	public List<Document> getAllDocumentsCreatedByUserOrderedByModificationDate(String userName){
		documentsRepository.findByCreateurDocumentUsername(userName, Sort.by(Sort.Direction.DESC,"documentDateModification" )).forEach(documents::add);
		return documents;
	}
	
	public List<Document> getAllDocumentsCreatedByUserOrderedByDocumentName(String userName){
		documentsRepository.findByCreateurDocumentUsername(userName, Sort.by(Sort.Direction.ASC,"nomDocument" )).forEach(documents::add);
		return documents;
	}
	//trouver tous les documents tq dateCreationDocument = creationDate
	public List<Document> getAllDocumentsCreatedInDate(Date creationDate){
		documentsRepository.findByDocumentDateCreation(creationDate).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq dateCreationDocument = creationDate ordonnées par la dernière date de modification
	public List<Document> getAllDocumentsCreatedInDateOrderedByModificationDate(Date creationDate){
		documentsRepository.findByDocumentDateCreation(creationDate, Sort.by(Sort.Direction.DESC,"documentDateModification" )).forEach(documents::add);
		return documents;
	}
	
	public List<Document> getAllDocumentsCreatedInDateOrderedByDocumentName(Date creationDate){
		documentsRepository.findByDocumentDateCreation(creationDate, Sort.by(Sort.Direction.ASC,"nomDocument" )).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq dateModificationDocument = modificationDate
	public List<Document> getAllDocumentsModifiedInDate(Date modificationDate){
		documentsRepository.findByDocumentDateModification(modificationDate).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq dateModificationDocument = modificationDate
	public List<Document> getAllDocumentsModifiedInDateOrderedByModificationDate(Date modificationDate){
		documentsRepository.findByDocumentDateModification(modificationDate, Sort.by(Sort.Direction.DESC,"documentDateModification" )).forEach(documents::add);
		return documents;
	}
	
	public List<Document> getAllDocumentsModifiedInDateOrderedByDocumentName(Date modificationDate){
		documentsRepository.findByDocumentDateModification(modificationDate, Sort.by(Sort.Direction.ASC,"nomDocument" )).forEach(documents::add);
		return documents;
	}
	
	public Document getDocumentById(Long documentId) {
		return documentsRepository.findById(documentId).get();
	}
	
	public Document getDocumentByName(String nomDocument) {
		return documentsRepository.findByNomDocument(nomDocument);
	}
	
	public void addDocument(Document document) {
		documentsRepository.save(document);
	}
	
	public void updateDocument(Document document) {
		documentsRepository.save(document);
	}
	
	/*public void deleteDocument(Document document) {
		documentsRepository.delete(document);
	}*/
	
	public void deleteDocumentById(Long id) {
		documentsRepository.deleteById(id);
	}

	public void deleteDocumentByName(String nomDocument) {
		documentsRepository.deleteByNomDocument(nomDocument);
	}
}
