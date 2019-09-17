package com.esi.genom.repository.lot2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot2.Annonce;

@Repository
public interface AnnonceRepository extends CrudRepository<Annonce,Long> {
	public List<Annonce> findByTitre(String titre);
//	public List<Annonce> findTop10ByOrderByDate_ajoutDesc();

}
