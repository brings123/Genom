package com.esi.genom.repositories.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot4.Categorie;
import com.esi.genom.entities.lot4.Ressource;

public interface RessourceRepository extends JpaRepository<Ressource,Integer> {
	public List<Ressource> findByName(String name);
	public List<Ressource> findByCategorieId(Integer id);
	public List<Ressource> findByClasseId(Integer id);
	public List<Ressource> findByTypeId(Integer id);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
