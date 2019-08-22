package com.esi.genom.services.lot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Document;
import com.esi.genom.repository.lot2.DocumentRepository;


@Service
public class DocumentService {
	@Autowired
	private DocumentRepository documentRepository;
	
	public List<Document> getAllDocument(){
		List<Document> documents = new ArrayList<>();
		
		documentRepository.findAll().forEach(documents::add);
		return documents;
	}
	
	/**
	 * Add new documents to the database
	 * @param annonce 
	 */
	public void addDocument(Document document) {
		documentRepository.save(document);
	}
	
	/**
	 * 
	 * @param id
	 * @return the document of a specific id
	 */
	public Document getDocument(Long id) {
		return documentRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateDocument( Document document) {
		documentRepository.save(document);
	}
	
	public void deleteDocument(Long id) {	
		documentRepository.deleteById(id);
	}

}
