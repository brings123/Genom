package com.esi.genom.repositories.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.esi.genom.entities.lot4.Caracteristique;
import com.esi.genom.entities.lot4.Categorie;
public interface CaracteristiqueRepository extends JpaRepository<Caracteristique,Integer>{
	public List<Caracteristique> findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}