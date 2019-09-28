package com.esi.genom.services.lot1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot1.Documents;
import com.esi.genom.repositories.lot1.DocumentsRepository;

@Service
public class DocumentsService {

	@Autowired
	private DocumentsRepository documentsRepository;
	private List<Documents> documents = new ArrayList<>();
	
	//trouver tous les documents qui existent
	public List<Documents> getAllDocumentsss() {
		documentsRepository.findAll().forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents qui existent ordonnées par la dernière date de modification
	public List<Documents> getAllDocumentsssOrderedByModificationDate() {
		documentsRepository.findAll(Sort.by(Sort.Direction.DESC, "documentDateModification")).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents qui existent ordonnées par la dernière date de création
	public List<Documents> getAllDocumentsssOrderedByCreationDate() {
		documentsRepository.findAll(Sort.by(Sort.Direction.DESC, "documentDateCreation")).forEach(documents::add);
		return documents;
	}
	
	public List<Documents> getAllDocumentsssOrderedByNomDocumentss() {
		documentsRepository.findAll(Sort.by(Sort.Direction.ASC, "nomDocumentss")).forEach(documents::add);
		return documents;
	}
	//trouver tous les documents tq id_type_document = typeId
	/*
	 * public List<Documentss> getAllDocumentsssOfType(Long typeId){
	 * documentsRepository.findByDocumentssTypeId(typeId);//;//.forEach(documents::add);
	 * return documents; }
	 * 
	 * //trouver tous les documents tq id_type_document = typeId ordonnées par la
	 * dernière date de modification public List<Documentss>
	 * getAllDocumentsssOfTypeOrderedByModificationDate(Long typeId){
	 * documentsRepository.findByDocumentssTypeId(typeId,
	 * Sort.by(Sort.Direction.DESC,"documentDateModification"
	 * ));//;//.forEach(documents::add); return documents; }
	 * 
	 * //trouver tous les documents tq id_type_document = typeId ordonnées par la
	 * dernière date de création public List<Documentss>
	 * getAllDocumentsssOfTypeOrderedByCreationDate(Long typeId){
	 * documentsRepository.findByDocumentssTypeId(typeId,
	 * Sort.by(Sort.Direction.DESC,"documentDateCreation"
	 * ));//;//.forEach(documents::add); return documents; }
	 * 
	 * public List<Documentss> getAllDocumentsssOfTypeOrderedByDocumentssName(Long
	 * typeId){ documentsRepository.findByDocumentssTypeId(typeId,
	 * Sort.by(Sort.Direction.ASC,"nomDocumentss" ));//;//.forEach(documents::add); return
	 * documents; }
	 */

	//trouver tous les documents tq type_document = type
	public List<Documents> getAllDocumentsssOfType(String type){
		documentsRepository.findByDocumentType(type).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq type_document = type ordonnées par la dernière date de modification
	/*
	 * public List<Documents>
	 * getAllDocumentsssOfTypeOrderedByModificationDate(String type){
	 * documentsRepository.findByDocumentType(type,
	 * Sort.by(Sort.Direction.DESC,"documentDateModification"
	 * ));//;//.forEach(documents::add); return documents; }
	 * 
	 * //trouver tous les documents tq type_document = type ordonnées par la
	 * dernière date de création public List<Documents>
	 * getAllDocumentsssOfTypeOrderedByCreationDate(String type){
	 * documentsRepository.findByDocumentType(type,
	 * Sort.by(Sort.Direction.DESC,"documentDateCreation"
	 * ));//;//.forEach(documents::add); return documents; }
	 */
	
	public List<Documents> getAllDocumentsssOfTypeOrderedByDocumentssName(String type){
		documentsRepository.findByDocumentType(type, Sort.by(Sort.Direction.ASC,"nomDocumentss" )).forEach(documents::add);
		return documents;
	}
	
	//trouver tous les documents tq createur = user
	/*
	 * public List<Documents> getAllDocumentsssCreatedByUser(String userName){
	 * documentsRepository.findByCreateurDocumentUsername(userName);//;//.forEach(
	 * documents::add); return documents; }
	 * 
	 * //trouver tous les documents tq createur = user ordonnées par la dernière
	 * date de modification public List<Documents>
	 * getAllDocumentsssCreatedByUserOrderedByModificationDate(String userName){
	 * documentsRepository.findByCreateurDocumentUsername(userName,
	 * Sort.by(Sort.Direction.DESC,"documentDateModification"
	 * ));//;//.forEach(documents::add); return documents; }
	 * 
	 * public List<Documents>
	 * getAllDocumentsssCreatedByUserOrderedByDocumentssName(String userName){
	 * documentsRepository.findByCreateurDocumentUsername(userName,
	 * Sort.by(Sort.Direction.ASC,"nomDocumentss" ));//;//.forEach(documents::add); return
	 * documents; }
	 */
	//trouver tous les documents tq dateCreationDocumentss = creationDate
	/*
	 * public List<Documents> getAllDocumentsssCreatedInDate(Date creationDate){
	 * documentsRepository.findByDocumentDateCreation(creationDate);//;//.forEach(
	 * documents::add); return documents; }
	 * 
	 * //trouver tous les documents tq dateCreationDocumentss = creationDate
	 * ordonnées par la dernière date de modification public List<Documents>
	 * getAllDocumentCreatedInDateOrderedByModificationDate(Date creationDate){
	 * documentsRepository.findByDocumentDateCreation(creationDate,
	 * Sort.by(Sort.Direction.DESC,"documentDateModification"
	 * ));//;//.forEach(documents::add); return documents; }
	 * 
	 * public List<Documents>
	 * getAllDocumentsssCreatedInDateOrderedByDocumentssName(Date creationDate){
	 * documentsRepository.findByDocumentDateCreation(creationDate,
	 * Sort.by(Sort.Direction.ASC,"nomDocumentss" ));//;//.forEach(documents::add);
	 * return documents; }
	 */
	
	//trouver tous les documents tq dateModificationDocumentss = modificationDate
	/*
	 * public List<Documents> getAllDocumentsssModifiedInDate(Date
	 * modificationDate){
	 * documentsRepository.findByDocumentDateModification(modificationDate);//;//.forEach(
	 * documents::add); return documents; }
	 */
	
	/*
	 * //trouver tous les documents tq dateModificationDocumentss = modificationDate
	 * public List<Documents>
	 * getAllDocumentsssModifiedInDateOrderedByModificationDate(Date
	 * modificationDate){
	 * documentsRepository.findByDocumentDateModification(modificationDate,
	 * Sort.by(Sort.Direction.DESC,"documentDateModification"
	 * ));//;//.forEach(documents::add); return documents; }
	 * 
	 * public List<Documents>
	 * getAllDocumentsssModifiedInDateOrderedByDocumentssName(Date
	 * modificationDate){
	 * documentsRepository.findByDocumentDateModification(modificationDate,
	 * Sort.by(Sort.Direction.ASC,"nomDocumentss" ));//;//.forEach(documents::add); return
	 * documents; }
	 */
	
	public Documents getDocumentssById(Long documentId) {
		return documentsRepository.findById(documentId).get();
	}
	
	public Documents getDocumentssByName(String nomDocumentss) {
		return documentsRepository.findByNomDocument(nomDocumentss);
	}
	
	public void addDocumentss(Documents document) {
		documentsRepository.save(document);
	}
	
	public void updateDocumentss(Documents document) {
		documentsRepository.save(document);
	}
	
	/*public void deleteDocumentss(Documentss document) {
		documentsRepository.delete(document);
	}*/
	
	public void deleteDocumentssById(Long id) {
		documentsRepository.deleteById(id);
	}
	
	public void deleteAllDocumentss() {
		documentsRepository.deleteAll();
	}

	public void deleteDocumentssByName(String nomDocumentss) {
		documentsRepository.deleteByNomDocument(nomDocumentss);
	}
}
