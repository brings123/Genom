package com.esi.genom.repositories.lot1;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot1.DocumentType;

public interface DocumentTypeRepository extends CrudRepository<DocumentType, Long>{
	
	public List<DocumentType> findAll(Sort sort);
	
	public List<DocumentType> findByTypeDocumentDateCreation(Date date);
	public List<DocumentType> findByTypeDocumentDateCreation(Date date, Sort sort);
	
	public List<DocumentType> findByCreateurTypeDocumentId(Long id);
	public List<DocumentType> findByCreateurTypeDocumentId(Long id, Sort sort);
	
	public List<DocumentType> findByCreateurTypeDocumentUsername(String userName);
	public List<DocumentType> findByCreateurTypeDocumentUsername(String userName, Sort sort);
	
	public DocumentType findByNomTypeDocument(String nomTypeDocument);
	
	public void deleteByNomTypeDocument(String nomTypeDocument);

}
