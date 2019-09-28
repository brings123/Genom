package com.esi.genom.repositories.lot1;

import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

//import com.esi.genom.entities.lot1.Document;
import com.esi.genom.entities.lot1.Documents;



@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Long>{
	
	//public List<Document> findByDocumentTypeId (Long id);
	//public List<Document> findByDocumentTypeId (Long id, Sort sort);
	//Les deux méthodes qui se suivent pouvent être remplacé par la méthode juste avant
	//public List<Document> findByDocumentTypeIdOrderByDocumentDateCreation(Long id);
	//public List<Document> findByDocumentTypeIdOrderByDocumentDateModification(Long id);
	
	public List<Documents> findByDocumentType(String nomTypeDocument);
	public List<Documents> findByDocumentType(String nomTypeDocument, Sort sort);
	
	//public List<Documents> findByCreateurDocumentUsername(String userName);
	//public List<Documents> findByCreateurDocumentUsername(String userName, Sort sort);
	
	//public List<Documents> findByDocumentDateModification(Date modificationDate);
	//public List<Documents> findByDocumentDateModification(Date modificationDate, Sort sort);
	
	//public List<Documents> findByDocumentDateCreation(Date creationDate);
	//public List<Documents> findByDocumentDateCreation(Date creationDate, Sort sort);
	
	public Documents findByNomDocument(String nomDocument); 
	
	public void deleteByNomDocument(String nomDocument);

}
