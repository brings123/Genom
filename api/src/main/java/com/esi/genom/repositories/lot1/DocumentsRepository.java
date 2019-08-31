package com.esi.genom.repositories.lot1;

import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esi.genom.entities.lot1.Document;



@Repository
public interface DocumentsRepository extends JpaRepository<Document, Long>{
	
	public List<Document> findByDocumentTypeTypeDocumentId (Long id);
	public List<Document> findByDocumentTypeTypeDocumentId (Long id, Sort sort);
	//Les deux méthodes qui se suivent pouvent être remplacé par la méthode juste avant
	public List<Document> findByDocumentTypeTypeDocumentIdOrderByDocumentDateCreation(Long id);
	public List<Document> findByDocumentTypeTypeDocumentIdOrderByDocumentDateModification(Long id);
	
	public List<Document> findByDocumentTypeNomTypeDocument(String nomTypeDocument);
	public List<Document> findByDocumentTypeNomTypeDocument(String nomTypeDocument, Sort sort);
	
	public List<Document> findByCreateurDocumentUsername(String userName);
	public List<Document> findByCreateurDocumentUsername(String userName, Sort sort);
	
	public List<Document> findByDocumentDateModification(Date modificationDate);
	public List<Document> findByDocumentDateModification(Date modificationDate, Sort sort);
	
	public List<Document> findByDocumentDateCreation(Date creationDate);
	public List<Document> findByDocumentDateCreation(Date creationDate, Sort sort);
	
	public Document findByNomDocument(String nomDocument); 
	
	public void deleteByNomDocument(String nomDocument);

}
