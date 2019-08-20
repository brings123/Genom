package com.esi.genom.repository.lot2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot2.Document;

public interface DocumentRepository extends CrudRepository<Document,Long> {
	public List<Document> findAll(String titre);
	public List<Document> findTop10ByOrderByDate_ajoutDesc(Date date_ajout);


}
