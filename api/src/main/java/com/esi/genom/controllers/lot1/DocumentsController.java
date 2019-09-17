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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot1.Document;
import com.esi.genom.services.lot1.DocumentsService;

@RestController
@RequestMapping("/lot1")
public class DocumentsController {
	
	@Autowired
	private DocumentsService documentsService;
	
	@RequestMapping(method=RequestMethod.GET,value="/allDocuments/unordered")
	public List<Document> getAllDocuments(){
		return documentsService.getAllDocuments();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/alldocuments/ordered_by/modification_date")
	public List<Document> getAllDocumentsOrderedByModificationDate(){
		return documentsService.getAllDocumentsOrderedByModificationDate();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/alldocuments/ordered_by/creation_date")
	public List<Document> getAllDocumentsOrderedByCreationDate(){
		return documentsService.getAllDocumentsOrderedByCreationDate();
	}
	
	@GetMapping("/alldocuments/ordered_by/document_name")
	public List<Document> getAllDocumentsOrderedByDocumentName(){
		return documentsService.getAllDocumentsOrderedByNomDocument();
	}
	
	@GetMapping("/documents_of_type_id/{typeId}")
	public List<Document> getTopic(@PathVariable("typeId") Long id) {
		return documentsService.getAllDocumentsOfType(id);
	}
	
	@GetMapping("/documents_of_type_id/{typeId}/ordered_by/modification_date")
	public List<Document> getAllDocumentsOfTypeOrderedByModificationDate(@PathVariable("typeId") Long id) {
		return documentsService.getAllDocumentsOfTypeOrderedByModificationDate(id);
	}
	
	@GetMapping("/documents_of_type_id/{typeId}/ordered_by/creation_date")
	public List<Document> getAllDocumentsOfTypeOrderedByCreationDate(@PathVariable("typeId") Long id) {
		return documentsService.getAllDocumentsOfTypeOrderedByCreationDate(id);
	}

	@GetMapping("/documents_of_type_id/{typeId}/ordered_by/document_name")
	public List<Document> getAllDocumentsOfTypeOrderedByDocumentName(@PathVariable("typeId") Long id) {
		return documentsService.getAllDocumentsOfTypeOrderedByDocumentName(id);
	}
	@GetMapping("/documents_of_type/{typeName}")
	public List<Document> getAllDocumentsOfType(@PathVariable("typeName") String type) {
		return documentsService.getAllDocumentsOfType(type);
	}
	
	@GetMapping("/documents_of_type/{typeName}/ordered_by/modification_date")
	public List<Document> getAllDocumentsOfTypeOrderedByModificationDate(@PathVariable("typeName") String type) {
		return documentsService.getAllDocumentsOfTypeOrderedByModificationDate(type);
	}	

	@GetMapping("/documents_of_type/{typeName}/ordered_by/creation_date")
	public List<Document> getAllDocumentsOfTypeOrderedByCreationDate(@PathVariable("typeName") String type) {
		return documentsService.getAllDocumentsOfTypeOrderedByCreationDate(type);
	}

	@GetMapping("/documents_of_type/{typeName}/ordered_by/document_name")
	public List<Document> getAllDocumentsOfTypeOrderedByDocumentName(@PathVariable("typeName") String type) {
		return documentsService.getAllDocumentsOfTypeOrderedByDocumentName(type);
	}
	
	@GetMapping("/documents_created_by/{userName}")
	public List<Document> getAllDocumentsCreatedByUser(@PathVariable String userName) {
		return documentsService.getAllDocumentsCreatedByUser(userName);
	}	

	@GetMapping("/documents_created_by/{userName}/ordered_by/modification_date")
	public List<Document> getAllDocumentsCreatedByUserOrderedByModificationDate(@PathVariable String userName){
		return documentsService.getAllDocumentsCreatedByUserOrderedByModificationDate(userName);
	}

	@GetMapping("/documents_created_by/{userName}/ordered_by/document_name")
	public List<Document> getAllDocumentsCreatedByUserOrderedByDocumentName(@PathVariable String userName){
		return documentsService.getAllDocumentsCreatedByUserOrderedByDocumentName(userName);
	}
	
	@GetMapping("/documents_created_in/{date}")
	public List<Document> getAllDocumentsCreatedInDate(@PathVariable Date date){
		return documentsService.getAllDocumentsCreatedInDate(date);
	}

	@GetMapping("/documents_created_in/{date}/ordered_by/modification_date")
	public List<Document> getAllDocumentsCreatedInDateOrderedByModificationDate(@PathVariable Date date){
		return documentsService.getAllDocumentsCreatedInDateOrderedByModificationDate(date);
	}
	
	@GetMapping("/documents_created_in/{date}/ordered_by/document_name")
	public List<Document> getAllDocumentsCreatedInDateOrderedByDocumentName(@PathVariable Date date){
		return documentsService.getAllDocumentsCreatedInDateOrderedByDocumentName(date);
	}
	
	
	@GetMapping("/documents_modified_in/{date}")
	public List<Document> getAllDocumentsModifiedInDate(@PathVariable Date date){
		return documentsService.getAllDocumentsModifiedInDate(date);
	}

	@GetMapping("/documents_modified_in/{date}/ordered_by/modification_date")
	public List<Document> getAllDocumentsModifiedInDateOrderedByModificationDate(@PathVariable Date date){
		return documentsService.getAllDocumentsModifiedInDateOrderedByModificationDate(date);
	}

	@GetMapping("/documents_modified_in/{date}/ordered_by/document_name")
	public List<Document> getAllDocumentsModifiedInDateOrderedByDocumentName(@PathVariable Date date){
		return documentsService.getAllDocumentsModifiedInDateOrderedByDocumentName(date);
	}
	
	@GetMapping("/document/{id}")
	public Document getDocumentById(@PathVariable Long id) {
		return documentsService.getDocumentById(id);
	}
	
	@GetMapping("/document_by_name/{name}")
	public Document getDocumentByName(@PathVariable String name) {
		return documentsService.getDocumentByName(name);
	}

	@PostMapping("/add_document")
	public void addDocument(@RequestBody Document document) {
		documentsService.addDocument(document);
	}
	
	@PutMapping("/update_document/{id}")
	public void updateDocument(@RequestBody Document document, @PathVariable Long id) {
		documentsService.updateDocument(document);
	}
	
	@DeleteMapping("/delete_by_id/{id}")
	public void deleteDocumentById(@PathVariable Long id) {
		documentsService.deleteDocumentById(id);
	}
	
	@DeleteMapping("/delete_by_name/{nomDocument}")
	public void deleteDocumentByName(@PathVariable String nomDocument) {
		documentsService.deleteDocumentByName(nomDocument);
	}
}
