package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.esi.genom.entities.lot2.Document;
import com.esi.genom.services.lot2.DocumentService;

@RestController
public class DocumentController {
	@Autowired
	private DocumentService documentService;
	
	@RequestMapping("/documents")
	public List<Document> getAllDocuments(){
		return documentService.getAllDocument();
	}
	
	@RequestMapping("/documents/{id}")
	public Document getDocument(@PathVariable Long id) {
		return documentService.getDocument(id);

	}
	
	@RequestMapping(value= "document",method =RequestMethod.POST)
    public void addDocument(@RequestBody Document document) {
		documentService.addDocument(document);
	}	
	

}
