package com.esi.genom.controllers.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Document;
import com.esi.genom.entities.users.ApiResponse;
import com.esi.genom.services.lot2.DocumentService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

public class DocumentController {
	@Autowired
	private DocumentService documentService;
	

	 @RequestMapping(value="/documents", method = RequestMethod.GET)
	    public ApiResponse<List<Document>> getAllDocuments(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Documents list fetched successfully.",documentService.getAllDocument());
	    }
	
	@RequestMapping("/documents/{id}")
	public Document getDocument(@PathVariable Long id) {
		return documentService.getDocument(id);

	}
	
	@RequestMapping(value= "document",method =RequestMethod.POST)
    public void addDocument(@RequestBody Document document) {
		documentService.addDocument(document);
	}	
	/**
	 * UPDATE DOCUMENT 
	 * @param document
	 * @param id
	 */
	
	@RequestMapping(value="/documents/update/{id}",method =RequestMethod.PUT)
    public void updateDocument(@RequestBody Document document,@PathVariable Long id) {
		documentService.updateDocument(document);
	}	
	
	
	

}
