package com.esi.genom.controllers.lot1;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot1.Documents;
import com.esi.genom.services.lot1.DocumentsService;

@RestController
@RequestMapping("/lot1")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DocumentsController {
	
	@Autowired
	private DocumentsService documentsService;
	
	@RequestMapping(method=RequestMethod.GET,value="/allDocuments/unordered")
	public List<Documents> getAllDocuments(){
		return documentsService.getAllDocumentsss();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/alldocuments/ordered_by/modification_date")
	public List<Documents> getAllDocumentsOrderedByModificationDate(){
		return documentsService.getAllDocumentsssOrderedByModificationDate();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/alldocuments/ordered_by/creation_date")
	public List<Documents> getAllDocumentsOrderedByCreationDate(){
		return documentsService.getAllDocumentsssOrderedByCreationDate();
	}
	
	@GetMapping("/alldocuments/ordered_by/document_name")
	public List<Documents> getAllDocumentsOrderedByDocumentsName(){
		return documentsService.getAllDocumentsssOrderedByNomDocumentss();
	}
	
	/*
	 * @GetMapping("/documents_of_type_id/{typeId}") public List<Documents>
	 * getTopic(@PathVariable("typeId") Long id) { return
	 * documentsService.getAllDocumentsOfType(id); }
	 * 
	 * @GetMapping("/documents_of_type_id/{typeId}/ordered_by/modification_date")
	 * public List<Documents>
	 * getAllDocumentsOfTypeOrderedByModificationDate(@PathVariable("typeId") Long
	 * id) { return
	 * documentsService.getAllDocumentsOfTypeOrderedByModificationDate(id); }
	 * 
	 * @GetMapping("/documents_of_type_id/{typeId}/ordered_by/creation_date") public
	 * List<Documents>
	 * getAllDocumentsOfTypeOrderedByCreationDate(@PathVariable("typeId") Long id) {
	 * return documentsService.getAllDocumentsOfTypeOrderedByCreationDate(id); }
	 * 
	 * @GetMapping("/documents_of_type_id/{typeId}/ordered_by/document_name") public
	 * List<Documents>
	 * getAllDocumentsOfTypeOrderedByDocumentsName(@PathVariable("typeId") Long id) {
	 * return documentsService.getAllDocumentsOfTypeOrderedByDocumentsName(id); }
	 */
	@GetMapping("/documents_of_type/{typeName}")
	public List<Documents> getAllDocumentsOfType(@PathVariable("typeName") String type) {
		return documentsService.getAllDocumentsssOfType(type);
	}
	
	

	/*
	 * @GetMapping("/documents_of_type/{typeName}/ordered_by/creation_date") public
	 * List<Documents>
	 * getAllDocumentsOfTypeOrderedByCreationDate(@PathVariable("typeName") String
	 * type) { return
	 * documentsService.getAllDocumentsssOfTypeOrderedByCreationDate(type); }
	 */
	@GetMapping("/documents_of_type/{typeName}/ordered_by/document_name")
	public List<Documents> getAllDocumentsOfTypeOrderedByDocumentsName(@PathVariable("typeName") String type) {
		return documentsService.getAllDocumentsssOfTypeOrderedByDocumentssName(type);
	}
	
	/*
	 * @GetMapping("/documents_created_in/{date}") public List<Documents>
	 * getAllDocumentsCreatedInDate(@PathVariable Date date){ return
	 * documentsService.getAllDocumentsssCreatedInDate(date); }
	 */

	/*
	 * @GetMapping("/documents_created_in/{date}/ordered_by/document_name") public
	 * List<Documents>
	 * getAllDocumentsCreatedInDateOrderedByDocumentsName(@PathVariable Date date){
	 * return
	 * documentsService.getAllDocumentsssCreatedInDateOrderedByDocumentssName(date);
	 * }
	 */
	
	/*
	 * @GetMapping("/documents_modified_in/{date}/ordered_by/document_name") public
	 * List<Documents>
	 * getAllDocumentsModifiedInDateOrderedByDocumentsName(@PathVariable Date date){
	 * return
	 * documentsService.getAllDocumentsssModifiedInDateOrderedByDocumentssName(date)
	 * ; }
	 */
	
	@GetMapping("/document/{id}")
	public Documents getDocumentsById(@PathVariable Long id) {
		return documentsService.getDocumentssById(id);
	}
	
	@GetMapping("/document_by_name/{name}")
	public Documents getDocumentsByName(@PathVariable String name) {
		return documentsService.getDocumentssByName(name);
	}

	@PostMapping("/add_document")
	public void addDocuments(@RequestBody Documents document) {
		documentsService.addDocumentss(document);
	}
	
	/*
	 * @PostMapping("/add_documents") public void addDocument(@RequestBody Documents
	 * document) { documentsService.addDocumentss(document); }
	 */
	
	@PutMapping("/update_document/{id}")
	public void updateDocuments(@RequestBody Documents document, @PathVariable Long id) {
		documentsService.updateDocumentss(document);
	}
	
	@DeleteMapping("/delete_documents/{id}")
	public void deleteDocumentsById(@PathVariable Long id) {
		documentsService.deleteDocumentssById(id);
	}
	
	@DeleteMapping("/delete_all_documents/")
	public void deleteDocuments() {
		documentsService.deleteAllDocumentss();
	}
	
	@DeleteMapping("/delete_document/{nomDocuments}")
	public void deleteDocumentsByName(@PathVariable String nomDocuments) {
		documentsService.deleteDocumentssByName(nomDocuments);
	}
}
