package com.esi.genom.controllers.lot1;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.services.lot1.DocumentTypeService;
import com.esi.genom.entities.lot1.DocumentType;;

@RestController
@RequestMapping("/lot1")
public class DocumentTypeController {

	@Autowired
	private DocumentTypeService documentTypeService;
	
	@GetMapping("/allDocumentTypes/unordered")
	public List<DocumentType> getAllDocumentTypes(){
		return documentTypeService.getAllDocumentTypes();
	}
	
	@GetMapping("/allDocumentTypes/ordered_by/nom_type_document")
	public List<DocumentType> getAllDocumentTypesOrderedByNomTypeDocument() {
		return documentTypeService.getAllDocumentTypesOrderedByNomTypeDocument();
	}
	
	@GetMapping("/allDocumentTypes/ordered_by/date_creation_type_document")
	public List<DocumentType> getAllDocumentTypesOrderedByTypeDocumentDateCreation() {
		return documentTypeService.getAllDocumentTypesOrderedByTypeDocumentDateCreation();
	}
	
	@GetMapping("/allDocumentTypes/CreatedIn/{date}/unordered")
	public List<DocumentType> getAllDocumentTypesCreatedIn(@PathVariable Date date){
		return documentTypeService.getAllDocumentTypesCreatedIn(date);
	}
	
	@GetMapping("/allDocumentTypes/CreatedIn/{date}/ordered_by/nom_type_document")
	public List<DocumentType> getAllDocumentTypesCreatedInOrderedByNomTypeDocument(@PathVariable Date date){
		return documentTypeService.getAllDocumentTypesCreatedInOrderedByNomTypeDocument(date);
	}
	
	@GetMapping("/allDocumentTypes/CreatedIn/{date}/ordered_by/date_creation_type_document")
	public List<DocumentType> getAllDocumentTypesCreatedInOrderedByTypeDocumentDateCreation(@PathVariable Date date){
		return documentTypeService.getAllDocumentTypesCreatedInOrderedByTypeDocumentDateCreation(date);
	}
	
	@GetMapping("/allDocumentTypes/CreatedBy/{userId}/unordered")
	public List<DocumentType> getAllDocumentTypeCreatedBy(@PathVariable Long userId){
		return documentTypeService.getAllDocumentTypeCreatedBy(userId);
	}
	
	@GetMapping("/allDocumentTypes/CreatedBy/{userId}/ordered_by/nom_type_document")
	public List<DocumentType> getAllDocumentTypesCreatedByOrderedByNomTypeDocument(@PathVariable Long userId){
		return documentTypeService.getAllDocumentTypesCreatedByOrderedByNomTypeDocument(userId);
	}
	
	@GetMapping("/allDocumentTypes/CreatedBy/{userId}/ordered_by/date_creation_type_document")
	public List<DocumentType> getAllDocumentTypeCreatedByOrderedByTypeDocumentDateCreation(@PathVariable Long userId){
		return documentTypeService.getAllDocumentTypeCreatedByOrderedByTypeDocumentDateCreation(userId);
	}
	
	@GetMapping("/allDocumentTypes/CreatedBy/{userName}/unordered")
	public List<DocumentType> getAllDocumentTypeCreatedBy(@PathVariable String userName){
		return documentTypeService.getAllDocumentTypeCreatedBy(userName);
	}
	
	@GetMapping("/allDocumentTypes/CreatedBy/{userName}/ordered_by/nom_type_document")
	public List<DocumentType> getAllDocumentTypesCreatedByOrderedByNomTypeDocument(@PathVariable String userName){
		return documentTypeService.getAllDocumentTypesCreatedByOrderedByNomTypeDocument(userName);
	}
	
	@GetMapping("/allDocumentTypes/CreatedBy/{userName}/ordered_by/date_creation_type_document")
	public List<DocumentType> getAllDocumentTypeCreatedByOrderedByTypeDocumentDateCreation(@PathVariable String userName){
		return documentTypeService.getAllDocumentTypeCreatedByOrderedByTypeDocumentDateCreation(userName);
	}
	
	@GetMapping("/DocumentType/{typeId}")
	public DocumentType getDocumentTypeById(@PathVariable Long typeId) {
		return documentTypeService.getDocumentTypeById(typeId);
	}
	
	@GetMapping("/DocumentType/{documentType}")
	public DocumentType getDocumentTypeByDocumentType(@PathVariable String documentType) {
		return documentTypeService.getDocumentTypeByDocumentType(documentType);
	}
	
	@PostMapping("/AddDocumentType")
	public void addDocumentType(@RequestBody DocumentType documentType) {
		documentTypeService.addDocumentType(documentType);
	}
	
	@PutMapping("/UpdateDocumentType/{id}")
	public void updateDocumentType(@RequestBody DocumentType documentType, @PathVariable Long id) {
		documentTypeService.updateDocumentType(documentType);
	}
	
	@DeleteMapping("/DeleteDocumentType/{id}")
	public void deleteDocumentTypeById(@PathVariable Long id) {
		documentTypeService.deleteDocumentTypeById(id);
	}
	
	@DeleteMapping("/DeleteDocumentType/{nomTypeDocument}")
	public void deleteDocumentTypeByNomTypeDocument(@PathVariable String nomTypeDocument) {
		documentTypeService.deleteDocumentTypeByNomTypeDocument(nomTypeDocument);
	}
}
